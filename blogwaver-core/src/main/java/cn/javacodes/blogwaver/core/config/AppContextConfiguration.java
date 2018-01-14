package cn.javacodes.blogwaver.core.config;

import cn.javacodes.blogwaver.core.i18n.I18nManager;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

/**
 * blogwaver
 * cn.javacodes.blogwaver.base.config
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2017/11/24
 */
@Configuration
@ComponentScan(
        basePackages = "cn.javacodes.blogwaver",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Component.class)
        }
)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@PropertySource({
        ResourceUtils.CLASSPATH_URL_PREFIX + "config.properties",
        ResourceUtils.CLASSPATH_URL_PREFIX + "important.properties"
})
public class AppContextConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    @Bean
    public I18nManager i18nManager(){
        return new I18nManager();
    }

}
