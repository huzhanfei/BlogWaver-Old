package cn.javacodes.blogwaver.core.service;

import cn.javacodes.blogwaver.core.model.Link;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.service
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/21
 */
public interface LinkService {

    int insertLink(Link link);

    Link selectById(Long id);


}
