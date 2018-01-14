/**
 * blogwaver
 * @since 2018/1/9
 */
module blogwaver.article {
    requires spring.web;
    requires spring.context;
    requires slf4j.api;
    requires blogwaver.core;

    exports cn.javacodes.blogwaver.article.controller to blogwaver.core;
}