package com.cg.movie.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowNotFoundException;
import com.cg.movie.service.ShowService;
import com.cg.movie.util.ShowConstants;

@RestController 
@CrossOrigin(origins= {"http://localhost:4200"}) 

public class DisplayShowMicroservice {
	@Autowired
	private ShowService showService;

	
	
	@GetMapping(ShowConstants.DISPLAY_SHOW_URL)
	public List<Show> displayByMovieId(@PathVariable("sname") int movie) throws ShowNotFoundException{
		List<Show> s=showService.displayShow(movie);
		return s;
	}
	
	
	

	
	
	
	
	
	
	}
	
		
		
	
