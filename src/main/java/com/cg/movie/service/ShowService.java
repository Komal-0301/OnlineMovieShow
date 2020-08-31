package com.cg.movie.service;

import java.util.List;


import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowException;


public interface ShowService {
	
   // public Show addShow(ShowDto sd);
	public List<Show> displayShow(String show) throws ShowException;
//	public String deleteShow(Show s) throws ShowException ;
	
}
