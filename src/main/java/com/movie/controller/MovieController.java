package com.movie.controller;

import com.movie.mapper.MovieMapper;
import com.movie.mapper.RatingMapper;
import com.movie.mapper.RecomMapper;
import com.movie.model.Movie;
import com.movie.model.Rating;
import com.movie.model.Recom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MovieController {

      //电影信息
      @Autowired
      private MovieMapper mm;
      //电影评价信息
      @Autowired
      RatingMapper rm;
      //电影评价信息
      @Autowired
      RecomMapper recomMapper;

      //按电影id来查找
      @RequestMapping("findMoiveById")
      @ResponseBody
      public Movie findMoiveById(Integer id){
           Movie movie = mm.selectByPrimaryKey(id);

           return movie;
      }

      //按电影名称来查找
      @RequestMapping("findMoiveByName")
      @ResponseBody
      public Movie findMoiveByName(String name){
            Movie movie = mm.selectByName(name);

            return movie;
      }

      //按用户id来查找，给这个用户推荐的电影
      @RequestMapping("recMovie")
      @ResponseBody
        public Recom recMovie(Integer id){
            Recom movie = recomMapper.selectByPrimaryKey(id);

            return movie;
        }

      //查看电影评分，通过电影id
      @RequestMapping("movieRate")
      @ResponseBody
      public Rating movieRate(Integer id){
          Rating movie = rm.selectByPrimaryKey(id);

          return movie;
      }


}
