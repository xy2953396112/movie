package com.movie.mapper;

import com.movie.model.Cover;
import org.springframework.stereotype.Service;


public interface CoverMapper {
    int insert(Cover record);

    int insertSelective(Cover record);

    Cover selectByPrimaryKey(Integer id);
}