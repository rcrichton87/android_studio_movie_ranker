package com.codeclan.movierankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    Movie movie1;

    @Before
    public void before(){
        movie1 = new Movie("A New Hope", "Sci Fi", 1);
    }

    @Test
    public void testMovieHasTitle(){
        assertEquals("A New Hope", movie1.getTitle());
    }

    @Test
    public void testMovieHasGenre(){
        assertEquals("Sci Fi", movie1.getGenre());
    }

    @Test
    public void testMovieHasRank(){
        assertEquals(1, movie1.getRanking());
    }

    @Test
    public void testSetTitle(){
        movie1.setTitle("The Empire Strikes Back");
        assertEquals("The Empire Strikes Back", movie1.getTitle());
    }

}
