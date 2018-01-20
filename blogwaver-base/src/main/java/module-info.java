/**
 * blogwaver
 * @since 2018/1/9
 */
module blogwaver.base {


    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires spring.security.config;
    requires spring.context.support;

    requires druid;
    requires org.apache.logging.log4j.core;
    requires slf4j.api;
    requires freemarker;
    requires commons.collections4;
    requires org.apache.commons.lang3;
    requires webjars.locator.core;

    requires javax.servlet.api;
    requires transitive blogwaver.core;
}