package com.codeclan.example.movieranking;

/**
 * Created by johnny on 22/05/2017.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class MovieTest {
    Movie movie;

    @Before
    public void before() {
        movie = new Movie("School of Rock", "Comedy", 3);
    }

    @Test
    public void canGetTitle() {
        assertEquals("School of Rock", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        movie.setTitle("Guardians of the Galaxy");
        assertEquals("Guardians of the Galaxy", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        movie.setGenre("Action");
        assertEquals("Action", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        assertEquals(3, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        movie.setRanking(2);
        assertEquals(2, movie.getRanking());
    }

    @Test
    public void canToString() {
        assertEquals("Title: 'School of Rock'; Genre: 'Comedy'; Ranking: 3", movie.toString());
    }

}