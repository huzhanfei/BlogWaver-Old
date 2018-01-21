package cn.javacodes.blogwaver.core.model.enumeration;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.model.enumeration
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/20
 */
public enum EditorType implements BaseCodeEnum {

    /**
     * Editor Type
     */
    MARKDOWN(0), RICH_TEXT(1);

    private int code;

    EditorType(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}