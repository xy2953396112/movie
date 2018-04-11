package com.movie.mapper;

import com.movie.model.Rating;

import java.util.List;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);

    Rating selectByPrimaryKey(Integer id);

    List<Rating> selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);
}