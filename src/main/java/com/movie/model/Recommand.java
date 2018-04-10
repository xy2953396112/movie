package com.movie.model;

import org.springframework.stereotype.Service;


public class Recommand {
    private Integer userid;

    private Integer movieid1;

    private Integer movieid2;

    private Integer movieid3;

    private Integer movieid4;

    private Integer movieid5;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMovieid1() {
        return movieid1;
    }

    public void setMovieid1(Integer movieid1) {
        this.movieid1 = movieid1;
    }

    public Integer getMovieid2() {
        return movieid2;
    }

    public void setMovieid2(Integer movieid2) {
        this.movieid2 = movieid2;
    }

    public Integer getMovieid3() {
        return movieid3;
    }

    public void setMovieid3(Integer movieid3) {
        this.movieid3 = movieid3;
    }

    public Integer getMovieid4() {
        return movieid4;
    }

    public void setMovieid4(Integer movieid4) {
        this.movieid4 = movieid4;
    }

    public Integer getMovieid5() {
        return movieid5;
    }

    public void setMovieid5(Integer movieid5) {
        this.movieid5 = movieid5;
    }
}