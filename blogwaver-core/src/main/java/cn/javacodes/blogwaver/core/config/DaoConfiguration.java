package cn.javacodes.blogwaver.core.config;

import cn.javacodes.blogwaver.core.annotation.mybatis.MybatisMapper;
import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;
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
@MapperScan(basePackages = "cn.javacodes.blogwaver", annotationClass = Repository.class)
public class DaoConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(DaoConfiguration.class);

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

    @Value("${db.params}")
    private String dbParams;

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

    @Value("${db.validationQuery}")
    private String dbValidationQuery;

    @Value("${db.testWhileIdle}")
    private Boolean dbTestWhileIdle;

    @Value("${db.testOnBorrow}")
    private Boolean dbTestOnBorrow;

    @Value("${db.testOnReturn}")
    private Boolean dbTestOnReturn;

    @Value("${db.poolPreparedStatements}")
    private Boolean dbPoolPreparedStatements;


    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://" + this.dbIpAddress + ":" + this.dbPort + "/" + this.dbName + "?" + this.dbParams);
        dataSource.setUsername(this.dbUsername);
        dataSource.setPassword(this.dbPassword);
        dataSource.setInitialSize(this.dbInitialSize);
        dataSource.setMinIdle(this.dbMinIdle);
        dataSource.setMaxActive(this.dbMaxActive);
        dataSource.setMaxWait(this.dbMaxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(this.dbTimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(this.dbMinEvictableIdleTimeMillis);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(this.dbMaxPoolPreparedStatementPerConnectionSize);
        dataSource.setFilters(this.dbFilters);
        dataSource.setValidationQuery(this.dbValidationQuery);
        dataSource.setTestWhileIdle(this.dbTestWhileIdle);
        dataSource.setTestOnBorrow(this.dbTestOnBorrow);
        dataSource.setTestOnReturn(this.dbTestOnReturn);
        dataSource.setPoolPreparedStatements(this.dbPoolPreparedStatements);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resourceResolver.getResources("classpath:sql-mapper/*.xml"));
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor()});
        sqlSessionFactoryBean.setTypeHandlersPackage("cn.javacodes.blogwaver.core.handler");
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws SQLException {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
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


}
