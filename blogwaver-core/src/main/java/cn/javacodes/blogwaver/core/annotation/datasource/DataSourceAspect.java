package cn.javacodes.blogwaver.core.annotation.datasource;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;


/**
 * 执行dao方法之前的切面
 * 获取datasource对象之前往HandleDataSource中指定当前线程数据源路由的key
 *
 * @author huzhanfei
 * @since 17-9-28
 */
public class DataSourceAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceAspect.class);

    /**
     * 在dao层方法之前获取datasource对象之前在切面中指定当前线程数据源路由的key
     */
    public void before(JoinPoint point) {

        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?>[] clazz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();

        try {
            Method m = clazz[0].getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                HandleDataSource.putDataSource(data.value());
                LOGGER.debug("正在使用" + data.value() + "数据源");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
