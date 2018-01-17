package cn.javacodes.blogwaver.core.annotation.datasource;

/**
 * com.jd.ump.screen.util
 * 保存当前线程数据源的key
 *
 * @author huzhanfei
 * @since 17-9-28
 */
class HandleDataSource {

    @SuppressWarnings("AlibabaThreadLocalShouldRemove")
    private static final ThreadLocal<String> DATASOURCE_HOLDER = new ThreadLocal<>();

    /**
     * 绑定当前线程数据源路由的key
     *
     * @param datasource 使用的数据源
     */
    static void putDataSource(String datasource) {
        DATASOURCE_HOLDER.set(datasource);
    }

    /**
     * 获取当前线程的数据源路由的key
     *
     * @return 使用的数据源
     */
    static String getDataSource() {
        return DATASOURCE_HOLDER.get();
    }

    static void removeDataSource() {
        DATASOURCE_HOLDER.remove();
    }
}
