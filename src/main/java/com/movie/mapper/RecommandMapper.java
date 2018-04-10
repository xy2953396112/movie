package com.movie.mapper;

import com.movie.model.Recommand;
import org.springframework.stereotype.Service;


public interface RecommandMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Recommand record);

    int insertSelective(Recommand record);

    Recommand selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Recommand record);

    int updateByPrimaryKey(Recommand record);
}