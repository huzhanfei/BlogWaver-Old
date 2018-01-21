package cn.javacodes.blogwaver.core.repository;


import cn.javacodes.blogwaver.core.annotation.mybatis.MybatisMapper;
import cn.javacodes.blogwaver.core.model.PostTag;
import org.springframework.stereotype.Repository;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.repository
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/01/20
 */
@Repository
public interface PostTagRepository {

    int deleteByPrimaryKey(Long id);

    int insert(PostTag record);

    int insertSelective(PostTag record);

    PostTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PostTag record);

    int updateByPrimaryKey(PostTag record);
}