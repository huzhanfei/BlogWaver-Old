package cn.javacodes.blogwaver.core.config;

import cn.javacodes.blogwaver.core.i18n.I18nManager;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Component.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Aspect.class),
        }
)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@PropertySources({
        @PropertySource(name = "config.properties", value = "classpath:config.properties"),
        @PropertySource(name = "important.properties", value = "classpath:important.properties"),
})
@Import({DaoConfiguration.class, SecurityConfiguration.class})
public class AppContextConfiguration {

    @Bean(name = "propertySourcesPlaceholderConfigurer")
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(false);
        return configurer;
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    @Bean
    public I18nManager i18nManager() {
        return new I18nManager();
    }

}
