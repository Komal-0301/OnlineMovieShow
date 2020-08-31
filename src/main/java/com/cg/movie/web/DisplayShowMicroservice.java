package com.cg.movie.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowException;
import com.cg.movie.service.ShowService;
import com.cg.movie.util.ShowConstants;

@RestController 
@CrossOrigin(origins= {"http://localhost:4200"}) 

public class DisplayShowMicroservice {
	@Autowired
	private ShowService showService;

	
	
	@GetMapping(ShowConstants.DISPLAY_SHOW_URL)
	public List<Show> displayShow(@PathVariable("sname") String show) throws ShowException{
		List<Show> slist=showService.displayShow(show);
		return slist;
	}
	
	
	
//		@PostMapping(ShowConstants.ADD_SHOW_URL)
//		public Show addShow(@PathVariable("add") ShowDto sd) {
//		
//		return showService.addShow(sd);
//	}
		
		
		
//		@DeleteMapping(ShowConstants.DELETE_SHOW_URL)
//		public String deleteShow(@PathVariable("delete") Show s) throws ShowException {
//		
//		return showService.deleteShow(s);
	
	
	
	
	
	
	}
	
		
		
	
