package cn.javacodes.blogwaver.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * blogwaver
 * cn.javacodes.blogwaver.base.controller.admin
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2017/11/30
 */
@Controller
@RequestMapping(value = {"/admin","/admin/dashboard"})
public class DashboardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String initDashboard(){
        LOGGER.info("initDashboard");
        return "admin-index.ftl";
    }


}
