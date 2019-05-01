package com.example.moviedb;


public class MoviesDetailsList {


    String movie_name, synopsis,yor,other,rating;




    public MoviesDetailsList(String movie_name, String synopsis, String yor, String other, String rating) {
        this.movie_name = movie_name;
        this.synopsis = synopsis;
        this.yor = yor;
        this.other = other;
        this.rating = rating;
    }

    public MoviesDetailsList() {

    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getYor() {
        return yor;
    }

    public void setYor(String yor) {
        this.yor = yor;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
