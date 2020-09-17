package com.cg.movie.web;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.dto.ErrorInfo;
import com.cg.movie.exceptions.ShowNotFoundException;


@RestControllerAdvice 
public class DisplayShowAdvice {
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErrorInfo handleShowException(ShowNotFoundException ex) {
		return new ErrorInfo(HttpStatus.NOT_FOUND.toString(), ex.getMessage(), LocalDateTime.now().toString());
	}
}
