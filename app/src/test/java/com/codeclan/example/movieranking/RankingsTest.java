package com.codeclan.example.movieranking;

import static org.junit.Assert.*;

/**
 * Created by johnny on 23/05/2017.
 */
import org.junit.*;

public class RankingsTest {
    private Rankings rankings;
    private Movie movie1, movie2, movie3;

    @Before
    public void before() {
        rankings = new Rankings();
        movie1 = new Movie("Guardians of the Galaxy", "Action", 1);
        movie2 = new Movie("Coach Carter", "Drama", 2);
        movie3 = new Movie("Oceans 11", "Thriller", 3);
    }

    @Test
    public void initialSizeIs100() {
        assertEquals(100, rankings.size());
    }

    @Test
    public void canAddMovieRanking1toIndex0() {
        rankings.add(movie1);
        assertEquals(movie1, rankings.getByIndex(0));
    }

    @Test
    public void canAddMovieRanking2toIndex1() {
        rankings.add(movie2);
        assertEquals(movie2, rankings.getByIndex(1));
    }

    @Test
    public void canAddMovieRanking2toIndex1_Index0isNull() {
        rankings.add(movie2);
        assertNull(rankings.getByIndex(0));
    }

    @Test
    public void canGetByRanking() {
        rankings.add(movie1);
        rankings.add(movie2);
        assertEquals(movie1, rankings.getByRanking(1));
        assertEquals(movie2, rankings.getByRanking(2));
    }

    @Test
    public void canGetByTitle() {
        rankings.add(movie1);
        rankings.add(movie2);
        rankings.add(movie3);
        assertEquals(movie3, rankings.getByTitle("Oceans 11"));
    }

    @Test
    public void canGetByTitleReturnsNullIfNotFound() {
        rankings.add(movie1);
        assertEquals(null, rankings.getByTitle("FIIIIIIIILM"));
    }

}
