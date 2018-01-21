package cn.javacodes.blogwaver.core.annotation.mybatis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.annotation.mybatis
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MybatisMapper {
}
