package com.movie.model;

import org.springframework.stereotype.Service;


public class Cover {
    private Integer id;

    private Integer first;

    private Integer second;

    private Integer third;

    private Integer forth;

    private Integer fifth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getThird() {
        return third;
    }

    public void setThird(Integer third) {
        this.third = third;
    }

    public Integer getForth() {
        return forth;
    }

    public void setForth(Integer forth) {
        this.forth = forth;
    }

    public Integer getFifth() {
        return fifth;
    }

    public void setFifth(Integer fifth) {
        this.fifth = fifth;
    }
}