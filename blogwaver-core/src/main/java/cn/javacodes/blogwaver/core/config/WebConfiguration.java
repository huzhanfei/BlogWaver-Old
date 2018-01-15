package cn.javacodes.blogwaver.core.config;


import cn.javacodes.blogwaver.core.interceptor.PjaxInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.freemarker.SpringTemplateLoader;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.HashMap;
import java.util.Map;


/**
 * blogwaver
 * cn.javacodes.blogwaver.base.config
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2017/11/24
 */
@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = "cn.javacodes.blogwaver",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ControllerAdvice.class),
        }
)
public class WebConfiguration implements WebMvcConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebConfiguration.class);

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_26);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setOutputEncoding("UTF-8");
        configuration.setTagSyntax(freemarker.template.Configuration.AUTO_DETECT_TAG_SYNTAX);
        configuration.setTemplateUpdateDelayMilliseconds(2000);
        configuration.setDateFormat("yyyy-MM-dd");
        configuration.setTimeFormat("HH:mm:ss");
        configuration.setDateTimeFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, String> importsMap = new HashMap<>(4);
        importsMap.put("spring", "/common/spring.ftl");
        configuration.setAutoImports(importsMap);
        configuration.setTemplateLoader(new SpringTemplateLoader(new DefaultResourceLoader(),
                ResourceUtils.CLASSPATH_URL_PREFIX + "templates"));
        freeMarkerConfigurer.setConfiguration(configuration);
        return freeMarkerConfigurer;
    }


    @Bean
    public ViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setViewClass(FreeMarkerView.class);
        viewResolver.setViewNames("*.ftl");
        viewResolver.setContentType("text/html; charset=UTF-8");
        viewResolver.setExposeRequestAttributes(true);
        viewResolver.setExposeSessionAttributes(true);
        viewResolver.setExposeSpringMacroHelpers(true);
        viewResolver.setRequestContextAttribute("request");
        viewResolver.setOrder(1);
        return viewResolver;
    }


    @Bean
    public HandlerAdapter servletHandlerAdapter() {
        return new SimpleServletHandlerAdapter();
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/assets/")
                .resourceChain(true)
                .addResolver(new GzipResourceResolver())
                .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));

        registry.addResourceHandler("/libs/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
                .resourceChain(true)
                .addResolver(new GzipResourceResolver());
    }


    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver commonsMultipartResolver() {
        return new CommonsMultipartResolver();
    }


    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }

    @Bean
    public SessionLocaleResolver sessionLocaleResolver() {
        return new SessionLocaleResolver();
    }


    @Bean
    public PjaxInterceptor pjaxInterceptor() {
        return new PjaxInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
        registry.addInterceptor(pjaxInterceptor());
    }


}
