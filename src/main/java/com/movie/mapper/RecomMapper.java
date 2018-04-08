package com.movie.mapper;

import com.movie.model.Recom;
import org.springframework.stereotype.Service;

@Service
public interface RecomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recom record);

    int insertSelective(Recom record);

    Recom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recom record);

    int updateByPrimaryKey(Recom record);
}