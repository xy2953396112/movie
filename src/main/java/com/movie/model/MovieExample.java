package com.movie.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMovieidIsNull() {
            addCriterion("movieID is null");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNotNull() {
            addCriterion("movieID is not null");
            return (Criteria) this;
        }

        public Criteria andMovieidEqualTo(Integer value) {
            addCriterion("movieID =", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotEqualTo(Integer value) {
            addCriterion("movieID <>", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThan(Integer value) {
            addCriterion("movieID >", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThanOrEqualTo(Integer value) {
            addCriterion("movieID >=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThan(Integer value) {
            addCriterion("movieID <", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThanOrEqualTo(Integer value) {
            addCriterion("movieID <=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidIn(List<Integer> values) {
            addCriterion("movieID in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotIn(List<Integer> values) {
            addCriterion("movieID not in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidBetween(Integer value1, Integer value2) {
            addCriterion("movieID between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotBetween(Integer value1, Integer value2) {
            addCriterion("movieID not between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andImdbidIsNull() {
            addCriterion("imdbID is null");
            return (Criteria) this;
        }

        public Criteria andImdbidIsNotNull() {
            addCriterion("imdbID is not null");
            return (Criteria) this;
        }

        public Criteria andImdbidEqualTo(Integer value) {
            addCriterion("imdbID =", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidNotEqualTo(Integer value) {
            addCriterion("imdbID <>", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidGreaterThan(Integer value) {
            addCriterion("imdbID >", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imdbID >=", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidLessThan(Integer value) {
            addCriterion("imdbID <", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidLessThanOrEqualTo(Integer value) {
            addCriterion("imdbID <=", value, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidIn(List<Integer> values) {
            addCriterion("imdbID in", values, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidNotIn(List<Integer> values) {
            addCriterion("imdbID not in", values, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidBetween(Integer value1, Integer value2) {
            addCriterion("imdbID between", value1, value2, "imdbid");
            return (Criteria) this;
        }

        public Criteria andImdbidNotBetween(Integer value1, Integer value2) {
            addCriterion("imdbID not between", value1, value2, "imdbid");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIsNull() {
            addCriterion("movie_director is null");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIsNotNull() {
            addCriterion("movie_director is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorEqualTo(String value) {
            addCriterion("movie_director =", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotEqualTo(String value) {
            addCriterion("movie_director <>", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorGreaterThan(String value) {
            addCriterion("movie_director >", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("movie_director >=", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLessThan(String value) {
            addCriterion("movie_director <", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLessThanOrEqualTo(String value) {
            addCriterion("movie_director <=", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLike(String value) {
            addCriterion("movie_director like", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotLike(String value) {
            addCriterion("movie_director not like", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIn(List<String> values) {
            addCriterion("movie_director in", values, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotIn(List<String> values) {
            addCriterion("movie_director not in", values, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorBetween(String value1, String value2) {
            addCriterion("movie_director between", value1, value2, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotBetween(String value1, String value2) {
            addCriterion("movie_director not between", value1, value2, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieActorIsNull() {
            addCriterion("movie_actor is null");
            return (Criteria) this;
        }

        public Criteria andMovieActorIsNotNull() {
            addCriterion("movie_actor is not null");
            return (Criteria) this;
        }

        public Criteria andMovieActorEqualTo(String value) {
            addCriterion("movie_actor =", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotEqualTo(String value) {
            addCriterion("movie_actor <>", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorGreaterThan(String value) {
            addCriterion("movie_actor >", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorGreaterThanOrEqualTo(String value) {
            addCriterion("movie_actor >=", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLessThan(String value) {
            addCriterion("movie_actor <", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLessThanOrEqualTo(String value) {
            addCriterion("movie_actor <=", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLike(String value) {
            addCriterion("movie_actor like", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotLike(String value) {
            addCriterion("movie_actor not like", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorIn(List<String> values) {
            addCriterion("movie_actor in", values, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotIn(List<String> values) {
            addCriterion("movie_actor not in", values, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorBetween(String value1, String value2) {
            addCriterion("movie_actor between", value1, value2, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotBetween(String value1, String value2) {
            addCriterion("movie_actor not between", value1, value2, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIsNull() {
            addCriterion("movie_picture is null");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIsNotNull() {
            addCriterion("movie_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePictureEqualTo(String value) {
            addCriterion("movie_picture =", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotEqualTo(String value) {
            addCriterion("movie_picture <>", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureGreaterThan(String value) {
            addCriterion("movie_picture >", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureGreaterThanOrEqualTo(String value) {
            addCriterion("movie_picture >=", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLessThan(String value) {
            addCriterion("movie_picture <", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLessThanOrEqualTo(String value) {
            addCriterion("movie_picture <=", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLike(String value) {
            addCriterion("movie_picture like", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotLike(String value) {
            addCriterion("movie_picture not like", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIn(List<String> values) {
            addCriterion("movie_picture in", values, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotIn(List<String> values) {
            addCriterion("movie_picture not in", values, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureBetween(String value1, String value2) {
            addCriterion("movie_picture between", value1, value2, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotBetween(String value1, String value2) {
            addCriterion("movie_picture not between", value1, value2, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreCountIsNull() {
            addCriterion("score_count is null");
            return (Criteria) this;
        }

        public Criteria andScoreCountIsNotNull() {
            addCriterion("score_count is not null");
            return (Criteria) this;
        }

        public Criteria andScoreCountEqualTo(Integer value) {
            addCriterion("score_count =", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotEqualTo(Integer value) {
            addCriterion("score_count <>", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountGreaterThan(Integer value) {
            addCriterion("score_count >", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_count >=", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountLessThan(Integer value) {
            addCriterion("score_count <", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountLessThanOrEqualTo(Integer value) {
            addCriterion("score_count <=", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountIn(List<Integer> values) {
            addCriterion("score_count in", values, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotIn(List<Integer> values) {
            addCriterion("score_count not in", values, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountBetween(Integer value1, Integer value2) {
            addCriterion("score_count between", value1, value2, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotBetween(Integer value1, Integer value2) {
            addCriterion("score_count not between", value1, value2, "scoreCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}