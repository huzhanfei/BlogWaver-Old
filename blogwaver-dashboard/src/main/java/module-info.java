/**
 * blogwaver
 * @since 2018/1/19
 */
module blogwaver.dashboard{
    requires spring.web;
    requires spring.context;
    requires slf4j.api;
    requires blogwaver.core;
    exports cn.javacodes.blogwaver.dashboard.controller to blogwaver.core;
}