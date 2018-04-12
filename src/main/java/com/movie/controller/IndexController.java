package com.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *   设置网站的首页
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
         //根据返回的视图，确定首页
        return new ModelAndView("index");
    }
    @RequestMapping("/account")
    public ModelAndView account() {
        return new ModelAndView("account");
    }
    @RequestMapping("/subject")
    public ModelAndView subject() {
        return new ModelAndView("subject");
    }
}
