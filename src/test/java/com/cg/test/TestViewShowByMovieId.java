package com.cg.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowNotFoundException;
import com.cg.movie.service.ShowService;

@SpringBootTest
public class TestViewShowByMovieId {
	
	@Autowired
	private ShowService service;
	
	@Test
	public void testByMovieIdOne() throws ShowNotFoundException{
		List<Show> slist=service.displayShow(1);
		Assertions.assertTrue(!slist.isEmpty());
	}
	
	@Test
	public void testByMovieIdTwo() throws ShowNotFoundException{
		List<Show> slist=service.displayShow(2);
		Assertions.assertTrue(!slist.isEmpty());
	}
	@Test
	public void testByShowNotFound() throws ShowNotFoundException{
		
		Assertions.assertThrows(ShowNotFoundException.class,()->service.displayShow(7));
	}

}
