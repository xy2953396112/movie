package com.movie.mapper;

import com.movie.model.Movie;
import org.springframework.stereotype.Service;

@Service
public interface MovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKeyWithBLOBs(Movie record);

    int updateByPrimaryKey(Movie record);

    Movie selectByName(String name);  //按名称查询
}