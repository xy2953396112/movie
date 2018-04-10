package com.movie.mapper;

import com.movie.model.Movie;
import com.movie.model.MovieExample;
import java.util.List;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer movieid);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExampleWithBLOBs(MovieExample example);

    List<Movie> selectByExample(MovieExample example);

    Movie selectByPrimaryKey(Integer movieid);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKeyWithBLOBs(Movie record);

    int updateByPrimaryKey(Movie record);
}