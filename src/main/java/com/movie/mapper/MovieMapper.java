package com.movie.mapper;

import com.movie.model.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer id);

    Movie selectByName(String name);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}