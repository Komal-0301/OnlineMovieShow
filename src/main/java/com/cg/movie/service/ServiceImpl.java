package com.cg.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.IMovieDao;
import com.cg.movie.dao.IShowDao;
import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowNotFoundException;
import com.cg.movie.util.ShowConstants;

@Service

public class ServiceImpl implements ShowService{
	@Autowired
	private IShowDao showDao;
	private IMovieDao movieDao;

	
	
	@Override
	public List<Show> displayShow(int movie) throws ShowNotFoundException {
	    List<Show> s=showDao.displayByMovieId(movie);
		if(s.isEmpty())
		    throw new ShowNotFoundException(ShowConstants.SHOW_NOT_AVAILABLE);
		return s;
	}

	}
