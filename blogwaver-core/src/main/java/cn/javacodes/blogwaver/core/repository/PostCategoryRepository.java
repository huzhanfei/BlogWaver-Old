package cn.javacodes.blogwaver.core.repository;


import cn.javacodes.blogwaver.core.annotation.mybatis.MybatisMapper;
import cn.javacodes.blogwaver.core.model.PostCategory;
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
public interface PostCategoryRepository {

    int deleteByPrimaryKey(Long id);

    int insert(PostCategory record);

    int insertSelective(PostCategory record);

    PostCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PostCategory record);

    int updateByPrimaryKey(PostCategory record);
}