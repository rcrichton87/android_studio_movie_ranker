package com.codeclan.movierankings;

import java.util.ArrayList;

public class RankingsList {

    ArrayList<Movie> rankedMovies;

    public RankingsList(ArrayList<Movie> movies){
        this.rankedMovies = sortRankingList(movies);
    }

    public ArrayList<Movie> sortRankingList(ArrayList<Movie> movies) {
        ArrayList<Movie> sortedMovies = new ArrayList<Movie>();
        int index = 0;
        while (index < 10) {
            for (Movie movie : movies) {
                if (index + 1 == movie.getRanking()) {
                    sortedMovies.add(movie);
                }
            }
            index += 1;
        }
        return sortedMovies;
    }

    public ArrayList<Movie> getAllMovies(){
        return rankedMovies;
    }

    public Movie getMovieByRanking(int rank){
        int index = rank - 1;
        return rankedMovies.get(index);
    }

    public void replaceLastMovie(Movie movie){
        movie.setRanking(10);
        rankedMovies.set(9, movie);
    }

    public int getSize(){
        return rankedMovies.size();
    }

    public Movie findMovieByTitle(String title){
        for (Movie movie : rankedMovies){
            if (movie.getTitle() == title){
                return movie;
            }
        }
        return null;
    }

    public void moveUpList(Movie movie){
        int movieRanking = movie.getRanking();
        int oldIndex = movieRanking - 1;
        int newIndex = movieRanking - 2;
        Movie replacedMovie = getMovieByRanking(movieRanking - 1);
        rankedMovies.set(newIndex, movie);
        rankedMovies.set(oldIndex, replacedMovie);
    }
}
