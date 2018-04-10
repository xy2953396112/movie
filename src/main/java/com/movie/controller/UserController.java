package com.movie.controller;

import com.movie.mapper.UserMapper;
import com.movie.model.User;
import com.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    UserMapper userMapper;

    //查询所有个人信息
    @RequestMapping(value = "/findSelf")
    @ResponseBody
    public User findSelf(Integer userId,HttpSession session){

         String username= (String) session.getAttribute("user");

         User user =  userMapper.selectByUserId(userId);

         return user;
    }


}