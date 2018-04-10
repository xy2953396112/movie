package com.movie.mapper;

import com.movie.model.Rating;
import com.movie.model.RatingExample;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);

    List<Rating> selectByExample(RatingExample example);

    Rating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);
}