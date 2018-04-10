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
@RequestMapping(value = "/movie")
public class MovieController {

      //电影信息
      @Autowired
     MovieMapper moviemapper;
      //电影评价信息
      @Autowired
      RatingMapper ratingmapper;
      //电影评价信息
      @Autowired
     RecommandMapper recommandmapper;
      @Autowired
      CoverMapper covermapper;

      //按电影id来查找
      @RequestMapping("/findMoiveById")
      @ResponseBody
      public Movie findMoiveById(Integer id){
           Movie movie = moviemapper.selectByPrimaryKey(id);

           return movie;
      }

    //按ImdbId来查找
    @RequestMapping("/findMoiveByImdbId")
    @ResponseBody
    public Movie findMoiveByImdbId(Integer id){

          MovieExample movieExample = new MovieExample();
        movieExample.or().andImdbidEqualTo(id);
        Movie movie = (Movie)moviemapper.selectByExample(movieExample);

        return movie;
    }

      //按电影名称来查找
      @RequestMapping("/findMoiveByName")
      @ResponseBody
      public Movie findMoiveByName(String name){


          MovieExample movieExample = new MovieExample();
          movieExample.or().andMovieNameEqualTo(name);
            Movie movie = (Movie) moviemapper.selectByExample(movieExample);

            return movie;
      }

      //按用户id来查找，给这个用户推荐的电影
      @RequestMapping("/recMovie")
      @ResponseBody
        public Recommand recMovieByUserId(Integer id){
          Recommand movie = recommandmapper.selectByPrimaryKey(id);

            return movie;
        }


    //封面相似度查找，根据Id查找
    @RequestMapping("/recCoverById")
    @ResponseBody
    public Cover recCoverById(Integer id){
        Cover cover = covermapper.selectByPrimaryKey(id);

        return cover;
    }

      //查看电影评分，通过电影userId,用户对电影的评分,单个评分
      @RequestMapping("/movieRate")
      @ResponseBody
      public Rating movieRate(Integer userId,Integer movieId){

          RatingExample re = new RatingExample();
          re.or().andUseridEqualTo(userId).andMovieidEqualTo(movieId);

         Rating rate = (Rating) ratingmapper.selectByExample(re);

          return rate;
      }

    //查看电影评分，通过电影userId,用户对电影的评分,所有的评分
    @RequestMapping("/movieRateByUserId")
    @ResponseBody
    public List<Rating> movieRateByUserId(Integer userId,Integer movieId){

        RatingExample re = new RatingExample();
        re.or().andUseridEqualTo(userId);

        List<Rating> rate = ratingmapper.selectByExample(re);

        return rate;
    }


}
