package com.codeclan.example.movieranking;

/**
 * Created by johnny on 22/05/2017.
 */

public class Rankings {

    Movie[] rankings;

    public Rankings() {
        rankings = new Movie[100];
    }

    public int size() {
        return rankings.length;
    }

    private int indexOf(Movie movie) {
        return movie.getRanking() - 1;
    }

    public void add(Movie movie) {
        rankings[indexOf(movie)] = movie;
    }

    public Movie getByIndex(int index) {
        return rankings[index];
    }

    public Movie getByRanking(int ranking) {
        return rankings[ranking - 1];
    }

    public Movie getByTitle(String title) {
        for (int i = 1; i < rankings.length; i++) {
            if (rankings[i] != null && rankings[i].title.equals(title)) {
                return rankings[i];
            }
        }
        return null; // if nothing found
    }

}
