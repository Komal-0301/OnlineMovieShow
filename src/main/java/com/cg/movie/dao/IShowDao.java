package com.cg.movie.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Show;

@Repository
public interface IShowDao extends JpaRepository<Show, Integer> {

	@Query("select s from Show s where s.movie.movieId=:sname")
	public List<Show> displayByMovieId(@Param("sname") int movie);

}
