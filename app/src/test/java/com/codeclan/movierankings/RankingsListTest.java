package com.codeclan.movierankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RankingsListTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Movie movie11;
    ArrayList<Movie> unsortedMovies;
    ArrayList<Movie> sortedMovies;
    RankingsList rankingsList;

    @Before
    public void before() {
        movie1 = new Movie("A New Hope", "Sci Fi", 2);
        movie2 = new Movie("The Empire Strikes Back", "Action", 1);
        movie3 = new Movie("Return of the Jedi", "Adventure", 3);
        movie4 = new Movie("Beetlejuice", "Comedy", 5);
        movie5 = new Movie("The Thing", "Horror", 4);
        movie6 = new Movie("Alien", "Horror", 6);
        movie7 = new Movie("Aliens", "Action", 8);
        movie8 = new Movie("Fellowship of the Ring", "Adventure", 9);
        movie9 = new Movie("The Two Towers", "Adventure", 7);
        movie10 = new Movie("Return of the King", "Adventure", 10);
        movie11 = new Movie("Jurassic Park", "Action", 11);


        unsortedMovies = new ArrayList<Movie>();
        sortedMovies = new ArrayList<Movie>();
        unsortedMovies.add(movie1);
        unsortedMovies.add(movie2);
        unsortedMovies.add(movie3);
        unsortedMovies.add(movie4);
        unsortedMovies.add(movie5);
        unsortedMovies.add(movie6);
        unsortedMovies.add(movie7);
        unsortedMovies.add(movie8);
        unsortedMovies.add(movie9);
        unsortedMovies.add(movie10);
        sortedMovies.add(movie2);
        sortedMovies.add(movie1);
        sortedMovies.add(movie3);
        sortedMovies.add(movie5);
        sortedMovies.add(movie4);
        sortedMovies.add(movie6);
        sortedMovies.add(movie9);
        sortedMovies.add(movie7);
        sortedMovies.add(movie8);
        sortedMovies.add(movie10);
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

    @Test
    public void testReplaceLastMovie(){
        rankingsList.replaceLastMovie(movie11);
        assertEquals(movie11, rankingsList.getMovieByRanking(10));
        assertEquals(10, rankingsList.getSize());
    }

}
