package com.movie.model;

public class Recom {
    private Integer id;

    private String username;

    private String first;

    private String second;

    private String third;

    private String fourth;

    private String fifth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first == null ? null : first.trim();
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second == null ? null : second.trim();
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third == null ? null : third.trim();
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth == null ? null : fourth.trim();
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth == null ? null : fifth.trim();
    }
}