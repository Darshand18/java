package com.wipro.java.collections;
import java.util.*;
public class Year implements Comparator<Movie> {
	 @Override
	    public int compare(Movie m1, Movie m2) {
	        // Compare movies based on movie release year (ascending order)
	        return Integer.compare(m1.getMovieReleaseYear(), m2.getMovieReleaseYear());
	    }

	    // Main method in Year class to demonstrate sorting by year
	    public static void main(String[] args) {
	        List<Movie> movieList = new ArrayList<>();
	        movieList.add(new Movie("Inception", 8.8, 2010));
	        movieList.add(new Movie("The Dark Knight", 9.0, 2008));
	        movieList.add(new Movie("The Matrix", 8.7, 1999));
	        movieList.add(new Movie("Avengers: Endgame", 8.4, 2019));
	        movieList.add(new Movie("Interstellar", 8.6, 2014));

	        System.out.println("Movies before sorting by year:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }

	        // Sorting the movies by year (using Year comparator)
	        Collections.sort(movieList, new Year());

	        System.out.println("\nMovies after sorting by year:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }
	    }
	}


