package cn.javacodes.blogwaver.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * blogwaver
 * cn.javacodes.blogwaver.user.controller.admin
 *
 * @author Fancy
 * @version 1.0
 * @since 2018/1/20
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String initInboxPage(){
        LOGGER.info("initListPage");
        return "admin-user-list.ftl";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String initComposePage(){
        LOGGER.info("initCreatePage");
        return "admin-user-create.ftl";
    }

}
