/**
 * blogwaver
 * @since 2018/1/16
 */
module blogwaver.user {
    requires spring.web;
    requires spring.context;
    requires slf4j.api;
    requires blogwaver.core;

    exports cn.javacodes.blogwaver.user.controller to blogwaver.core;
}