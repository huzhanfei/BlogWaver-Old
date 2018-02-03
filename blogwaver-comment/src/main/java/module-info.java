/**
 * blogwaver
 * @since 2018/1/19
 */
module blogwaver.comment{
    requires spring.web;
    requires spring.context;
    requires slf4j.api;
    requires blogwaver.core;
    exports cn.javacodes.blogwaver.comment.controller to blogwaver.core;
}