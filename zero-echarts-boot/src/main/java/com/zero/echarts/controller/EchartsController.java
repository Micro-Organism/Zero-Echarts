package com.zero.echarts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/echarts")
public class EchartsController {

    /**
     * 这样写不能访问static中index文件夹下的index.html页面
     *
     * @return 首页
     */
    @RequestMapping("index1")
    public String indexDynamic() {
        return "html/index";
    }

    /**
     * 这样写可以访问static中html文件夹下的static.html页面
     *
     * @return 首页
     */
    @RequestMapping("index2")
    public String indexStatic() {
        return "html/static.html";
    }

    /**
     * 请求redirect会重定向到index页面
     *
     * @return 重定向到index页面
     */
    @RequestMapping("redirect")
    public String redirect() {
        return "redirect:/echarts/index1";
    }

    /**
     * 请求forward会重定向到index 页面
     * 也可以转发，放ip:port/index，打开static下的html目录中的static.html
     *
     * @return 重定向到static页面
     */
    @RequestMapping("forward")
    public String forward() {
        return "forward:/html/static.html";
    }

}