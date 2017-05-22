package com.codeclan.example.moiverankings;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by johnny on 22/05/2017.
 */
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
    public void canGetGenre() {
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        assertEquals(3, movie.getRanking());
    }




}