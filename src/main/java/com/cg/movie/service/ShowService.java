package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowNotFoundException;


public interface ShowService {
	
   // public Show addShow(ShowDto sd);
	public List<Show> displayShow(int movie) throws ShowNotFoundException;
   // public String deleteShow(Show s) throws ShowException ;

	//int findBytheMovieId(Movie m);
	
}
