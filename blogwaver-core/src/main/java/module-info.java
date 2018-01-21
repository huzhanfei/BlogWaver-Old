/**
 * blogwaver
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/14
 */
module blogwaver.core {

    exports cn.javacodes.blogwaver.core.config to blogwaver.base;

    exports cn.javacodes.blogwaver.core.service;
    exports cn.javacodes.blogwaver.core.repository;
    exports cn.javacodes.blogwaver.core.handler;
    exports cn.javacodes.blogwaver.core.util;
    exports cn.javacodes.blogwaver.core.i18n;
    exports cn.javacodes.blogwaver.core.common.datatables;


    requires javax.servlet.api;
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
    requires aspectjweaver;
    requires spring.jdbc;
    requires java.sql;
    requires mybatis.spring;
    requires mybatis;
    requires pagehelper;
    requires java.naming;
    requires java.management;
    requires javax.inject;

}