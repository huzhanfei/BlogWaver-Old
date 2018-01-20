package cn.javacodes.blogwaver.core.config;

import cn.javacodes.blogwaver.core.annotation.datasource.ChooseDataSource;
import cn.javacodes.blogwaver.core.annotation.datasource.DataSourceType;
import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * blogwaver
 * cn.javacodes.blogwaver.base.config
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2017/11/24
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class DaoConfiguration {

    @Value("${db.ip}")
    private String dbIpAddress;

    @Value("${db.port}")
    private String dbPort;

    @Value("${db.name}")
    private String dbName;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.initialSize}")
    private Integer dbInitialSize;

    @Value("${db.minIdle}")
    private Integer dbMinIdle;

    @Value("${db.maxActive}")
    private Integer dbMaxActive;

    @Value("${db.maxWait}")
    private Long dbMaxWait;

    @Value("${db.timeBetweenEvictionRunsMillis}")
    private Long dbTimeBetweenEvictionRunsMillis;

    @Value("${db.minEvictableIdleTimeMillis}")
    private Long dbMinEvictableIdleTimeMillis;

    @Value("${db.maxPoolPreparedStatementPerConnectionSize}")
    private Integer dbMaxPoolPreparedStatementPerConnectionSize;

    @Value("${db.filters}")
    private String dbFilters;

    @Value("${db.ip.slave}")
    private String dbSlaveIpAddress;

    @Value("${db.port.slave}")
    private String dbSlavePort;

    @Value("${db.name.slave}")
    private String dbSlaveName;

    @Value("${db.username.slave}")
    private String dbSlaveUsername;

    @Value("${db.password.slave}")
    private String dbSlavePassword;


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setPlugins(new Interceptor[]{pageInterceptor()});
        return sqlSessionFactory.getObject();
    }

    private Interceptor pageInterceptor() {
        Interceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("pageSizeZero", "true");
        properties.setProperty("reasonable", "true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }


    @Bean
    public DataSource dataSource() throws SQLException {
        ChooseDataSource dataSource = new ChooseDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>(4);
        DruidDataSource masterSource = masterDataSource();
        DruidDataSource slaveSource = slaveDataSource();
        dataSourceMap.put(DataSourceType.MASTER, masterSource);
        dataSourceMap.put(DataSourceType.SLAVE, slaveSource);
        dataSource.setTargetDataSources(dataSourceMap);
        dataSource.setDefaultTargetDataSource(masterSource);
        return dataSource;
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource masterDataSource() throws SQLException {
        return getDruidDataSource(dbIpAddress, dbPort, dbName, dbUsername, dbPassword, dbInitialSize,
                dbMinIdle, dbMaxActive, dbMaxWait, dbTimeBetweenEvictionRunsMillis,
                dbMaxPoolPreparedStatementPerConnectionSize, dbFilters);
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource slaveDataSource() throws SQLException {
        return getDruidDataSource(dbSlaveIpAddress, dbSlavePort, dbSlaveName, dbSlaveUsername, dbSlavePassword,
                dbInitialSize, dbMinIdle, dbMaxActive, dbMaxWait, dbTimeBetweenEvictionRunsMillis,
                dbMaxPoolPreparedStatementPerConnectionSize, dbFilters);
    }


    private DruidDataSource getDruidDataSource(String dbIpAddress, String dbPort, String dbName,
                                               String dbUsername, String dbPassword, Integer dbInitialSize,
                                               Integer dbMinIdle, Integer dbMaxActive, Long dbMaxWait,
                                               Long dbTimeBetweenEvictionRunsMillis,
                                               Integer dbMaxPoolPreparedStatementPerConnectionSize,
                                               String dbFilters) throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://" + dbIpAddress + ":" + dbPort + "/" + dbName +"?useSSL=false&useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        dataSource.setInitialSize(dbInitialSize);
        dataSource.setMinIdle(dbMinIdle);
        dataSource.setMaxActive(dbMaxActive);
        dataSource.setMaxWait(dbMaxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(dbTimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(dbMinEvictableIdleTimeMillis);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(dbMaxPoolPreparedStatementPerConnectionSize);
        dataSource.setFilters(dbFilters);
        dataSource.setValidationQuery("SELECT 'x'");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setPoolPreparedStatements(true);
        return dataSource;
    }


}
