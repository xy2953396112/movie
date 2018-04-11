package com.movie.mapper;

import com.movie.model.Cover;

public interface CoverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cover record);

    int insertSelective(Cover record);

    Cover selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cover record);

    int updateByPrimaryKey(Cover record);
}