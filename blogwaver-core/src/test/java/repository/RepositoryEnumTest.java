package repository;

import cn.javacodes.blogwaver.core.config.AppContextConfiguration;
import cn.javacodes.blogwaver.core.config.DaoConfiguration;
import cn.javacodes.blogwaver.core.model.Link;
import cn.javacodes.blogwaver.core.model.enumeration.LinkStatus;
import cn.javacodes.blogwaver.core.repository.LinkRepository;
import cn.javacodes.blogwaver.core.service.LinkService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * blogwaver
 * PACKAGE_NAME
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/1/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppContextConfiguration.class, DaoConfiguration.class})
@WebAppConfiguration
public class RepositoryEnumTest {

    @Autowired
    private LinkService linkService;

    @Transactional
    @Test
    public void testInsert() {
        Link link = new Link();
        link.setAddress("aaa");
        link.setName("aaa");
        link.setOrder(1);
        link.setTag("tag");
        link.setStatus(LinkStatus.DISABLED);
        linkService.insertLink(link);
    }

    @Transactional
    @Test
    public void testSelect() {
        Link link = linkService.selectById(4L);
        Assert.assertEquals(link.getStatus().getCode(), LinkStatus.DISABLED.getCode());
        System.out.println(link.getStatus());
    }

}
