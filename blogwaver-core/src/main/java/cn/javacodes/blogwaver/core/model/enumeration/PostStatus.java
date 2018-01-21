package cn.javacodes.blogwaver.core.model.enumeration;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.model.enumeration
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/20
 */
public enum PostStatus implements BaseCodeEnum {

    /**
     * Post Status
     */
    DRAFT(0), PUBLISHED(1), DELETED(3);

    private int code;

    PostStatus(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}