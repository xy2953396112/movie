package com.movie.controller;

import com.movie.mapper.CoverMapper;
import com.movie.mapper.MovieMapper;
import com.movie.mapper.RatingMapper;
import com.movie.mapper.RecommandMapper;
import com.movie.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/movie")
public class MovieController {

      //电影信息
      @Autowired
      MovieMapper mm;

        //电影信息
        @Autowired
        RatingMapper ratingMapper;


      //电影信息
      @Autowired
      RecommandMapper recommandMapper;

    //电影信息
    @Autowired
    CoverMapper coverMapper;

      //按电影id来查找
      @RequestMapping("/findMoiveById")
      @ResponseBody
      public Movie findMoiveById(Integer id){
           Movie movie = mm.selectByPrimaryKey(id);

           return movie;
      }

    //按电影IMDBid来查找
    @RequestMapping("/findMoiveByImdbId")
    @ResponseBody
    public Movie findMoiveByImdbId(Integer id){
        Movie movie = mm.selectByImdbId(id);

        return movie;
    }

    //按照userid查询,返回集合
    @RequestMapping("/findRatingByUserId")
    @ResponseBody
    public List<Rating> findRatingByUserId(Integer userID){
        List<Rating> list = (List<Rating>) ratingMapper.selectByUserId(userID);

        return list;
    }

    //按电影id来查找
    @RequestMapping("/recMovie")
    @ResponseBody
    public Recommand recMovie(Integer userID) {
        Recommand recommand = recommandMapper.selectByPrimaryKey(userID);

        return recommand;
    }

    //按cover id来查找
    @RequestMapping("/findRecByImdbId")
    @ResponseBody
    public Cover recCover(Integer id) {
        Cover cover = coverMapper.selectByPrimaryKey(id);

        return cover;
    }









}
