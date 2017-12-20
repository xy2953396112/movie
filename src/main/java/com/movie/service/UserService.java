package com.movie.service;

import com.movie.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    public User selectUser();
    List<User> findAllUser(int pageNum, int pageSize);
    User findUserByUserName(String username);
}