package com.movie.mapper;

import com.movie.model.User_role;
import org.springframework.stereotype.Service;

@Service
public interface User_roleMapper {
    int insert(User_role record);

    int insertSelective(User_role record);
}