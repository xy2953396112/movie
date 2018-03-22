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
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/select")
    public User selectUser(){
        return userService.selectUser();

    }


    @RequestMapping(value = "/index")
    public String index(){
        return "index";

    }

    //查询所有个人信息
    @RequestMapping(value = "/findSelf")
    @ResponseBody
    public List<User> findSelf(HttpSession session){

         String username= (String) session.getAttribute("user");

         List<User> list =  userMapper.selectAllUser();

         return list;
    }

    //根据主键查询个人信息
    @RequestMapping(value = "/findSelf")
    @ResponseBody
    public User findSelf(Integer id){



        User user =  userMapper.selectByPrimaryKey(id);

        return user;
    }
}