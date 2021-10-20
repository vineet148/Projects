package com.example.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomisedResposeEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));

		ResponseEntity responseEntity = new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

		return responseEntity;

	}
	
	@ExceptionHandler(UserNotFoundExecption.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundExecption ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));

		ResponseEntity responseEntity = new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

		return responseEntity;

	}

}
