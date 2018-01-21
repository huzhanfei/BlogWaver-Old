package cn.javacodes.blogwaver.core.repository;


import cn.javacodes.blogwaver.core.annotation.mybatis.MybatisMapper;
import cn.javacodes.blogwaver.core.model.Option;
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
public interface OptionRepository {

    int deleteByPrimaryKey(Long id);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}