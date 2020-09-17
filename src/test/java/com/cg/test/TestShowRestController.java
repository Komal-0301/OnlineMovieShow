package com.cg.test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowNotFoundException;

public class TestShowRestController {
	
	private RestTemplate rt=new RestTemplate();
	@Test
	public void testDisplayByMovieId() {
		String url="http://localhost:8082/show/displayshow/1";
		
		ResponseEntity<List<Show>> resp=
				rt.exchange(url,HttpMethod.GET,null,
						new ParameterizedTypeReference<List<Show>>() {} );
		
		assertFalse(resp.getBody().isEmpty());
	}
	
	@Test
	public void testDisplayByMovieId2() throws ShowNotFoundException{
		String url="http://localhost:8082/show/displayshow/20";
		
		assertThrows(HttpClientErrorException.class,
				()->rt.exchange(url,HttpMethod.GET,null,
						new ParameterizedTypeReference<List<Show>>() {} ));
		
	}

}
