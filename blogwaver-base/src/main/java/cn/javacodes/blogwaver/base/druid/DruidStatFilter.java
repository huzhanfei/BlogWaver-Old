package cn.javacodes.blogwaver.base.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


/**
 * blogwaver
 * cn.javacodes.blogwaver.base.druid
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2017/11/28
 */
@WebFilter(
        filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")}
)
public class DruidStatFilter extends WebStatFilter {
}
