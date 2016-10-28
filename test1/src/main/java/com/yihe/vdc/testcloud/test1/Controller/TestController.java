package com.yihe.vdc.testcloud.test1.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zwz
 * Date: 2016/8/4 14:13.
 */
@Controller
public class TestController {

    private Logger log= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/test")
    public void test(HttpServletResponse response){
        try {
            response.getWriter().write("test");
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
