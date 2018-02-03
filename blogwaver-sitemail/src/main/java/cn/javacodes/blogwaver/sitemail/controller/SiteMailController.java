package cn.javacodes.blogwaver.sitemail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * blogwaver
 * cn.javacodes.blogwaver.sitemail.controller.admin
 *
 * @author Kevin Len
 * @version 1.0
 * @since 2018/1/16
 */
@Controller
@RequestMapping(value = "/admin/sitemail")
public class SiteMailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SiteMailController.class);

    @RequestMapping(value = "/inbox", method = RequestMethod.GET)
    public String initInboxPage() {
        LOGGER.info("initInboxPage");
        return "admin-sitemail-inbox.ftl";
    }

    @RequestMapping(value = "/compose", method = RequestMethod.GET)
    public String initComposePage() {
        LOGGER.info("initComposePage");
        return "admin-sitemail-compose.ftl";
    }

    @RequestMapping(value = "/draft", method = RequestMethod.GET)
    public String initDraftPage() {
        LOGGER.info("initDraftPage");
        return "admin-sitemail-draft.ftl";
    }

    @RequestMapping(value = "/trash", method = RequestMethod.GET)
    public String initTrashPage() {
        LOGGER.info("initTrashPage");
        return "admin-sitemail-trash.ftl";
    }

    @RequestMapping(value = "/readmail", method= RequestMethod.GET)
    public String initReadMailPage(){
        LOGGER.info("initReadMailPage");
        return "admin-sitemail-readmail.ftl";
    }

}
