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


}
