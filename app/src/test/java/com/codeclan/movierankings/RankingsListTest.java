package com.codeclan.movierankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RankingsListTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    ArrayList<Movie> unsortedMovies;
    ArrayList<Movie> sortedMovies;
    RankingsList rankingsList;

    @Before
    public void before() {
        movie1 = new Movie("A New Hope", "Sci Fi", 2);
        movie2 = new Movie("The Empire Strikes Back", "Action", 1);
        movie3 = new Movie("Return of the Jedi", "Adventure", 3);
        unsortedMovies = new ArrayList<Movie>();
        sortedMovies = new ArrayList<Movie>();
        unsortedMovies.add(movie1);
        unsortedMovies.add(movie2);
        unsortedMovies.add(movie3);
        sortedMovies.add(movie2);
        sortedMovies.add(movie1);
        sortedMovies.add(movie3);
        rankingsList = new RankingsList(unsortedMovies);
    }

    @Test
    public void testNewRankedListIsSorted(){
        assertEquals(sortedMovies, rankingsList.getAllMovies());
    }

    @Test
    public void testGetMovieByRanking(){
        assertEquals(movie2, rankingsList.getMovieByRanking(1));
    }

}
