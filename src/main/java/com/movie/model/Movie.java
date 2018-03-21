package com.movie.model;

public class Movie {
    private Integer id;

    private String movieName;

    private String movieUrl;

    private String movieActor;

    private String movieIntro;

    private String movieRate;

    private String movieLabel;

    private String moviePicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }

    public String getMovieActor() {
        return movieActor;
    }

    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor == null ? null : movieActor.trim();
    }

    public String getMovieIntro() {
        return movieIntro;
    }

    public void setMovieIntro(String movieIntro) {
        this.movieIntro = movieIntro == null ? null : movieIntro.trim();
    }

    public String getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(String movieRate) {
        this.movieRate = movieRate == null ? null : movieRate.trim();
    }

    public String getMovieLabel() {
        return movieLabel;
    }

    public void setMovieLabel(String movieLabel) {
        this.movieLabel = movieLabel == null ? null : movieLabel.trim();
    }

    public String getMoviePicture() {
        return moviePicture;
    }

    public void setMoviePicture(String moviePicture) {
        this.moviePicture = moviePicture == null ? null : moviePicture.trim();
    }
}