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

}
