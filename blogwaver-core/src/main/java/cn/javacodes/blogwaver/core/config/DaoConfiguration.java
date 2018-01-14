package cn.javacodes.blogwaver.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
}
