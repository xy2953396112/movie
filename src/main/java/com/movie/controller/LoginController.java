package com.movie.controller;

import com.movie.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {




    @RequestMapping("/login")
    public String loginUser(String username,String password,HttpSession session) {
        //UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        //Subject subject = SecurityUtils.getSubject();
        try {
            //subject.login(usernamePasswordToken);   //完成登录

            session.setAttribute("user", username);
            return "index";
        } catch(Exception e) {
            return "account";//返回登录页面
        }
        
    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {

        session.removeAttribute("user");
        return "index";
    }
}