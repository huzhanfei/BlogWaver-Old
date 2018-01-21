package cn.javacodes.blogwaver.core.service.impl;

import cn.javacodes.blogwaver.core.model.Link;
import cn.javacodes.blogwaver.core.repository.LinkRepository;
import cn.javacodes.blogwaver.core.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.service.impl
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/21
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkRepository linkRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertLink(Link link) {
        return linkRepository.insert(link);
    }

    @Override
    public Link selectById(Long id) {
        return linkRepository.selectByPrimaryKey(id);
    }
}
