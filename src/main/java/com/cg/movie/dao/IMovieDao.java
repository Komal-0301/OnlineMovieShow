package com.cg.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Movie;

@Repository
public interface IMovieDao extends JpaRepository<Movie, Integer>{

}
