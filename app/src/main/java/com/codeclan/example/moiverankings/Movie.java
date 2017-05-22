package com.codeclan.example.moiverankings;

/**
 * Created by johnny on 22/05/2017.
 */

public class Movie {
    String title;
    String genre;
    int ranking;


    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRanking() {
        return ranking;
    }
}