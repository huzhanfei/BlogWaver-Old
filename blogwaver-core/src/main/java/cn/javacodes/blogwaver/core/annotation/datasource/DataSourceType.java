package cn.javacodes.blogwaver.core.annotation.datasource;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.annotation.datasource
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/17
 */
public enum DataSourceType {
    /**
     * 主库
     */
    MASTER("master", 0),
    /**
     * 从库
     */
    SLAVE("slave", 1);

    private String name;

    private Integer index;

    DataSourceType(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }

    public static DataSourceType getDataSourceTypeByName(String name){
        switch (name){
            case "master":
                return MASTER;
            case "slave":
                return SLAVE;
            default:
                return null;
        }
    }
}
