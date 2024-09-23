package com.exception;


import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		
		// Fill the code here
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		//return null;
	}
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleNotFoundException(RuntimeException ex, WebRequest request) {
		
		// Fill the code here
		ExceptionResponse er= new ExceptionResponse (LocalDate.now(),ex.getMessage(),ex.getLocalizedMessage(),"500");
		return new ResponseEntity<ExceptionResponse>(er,HttpStatus.NOT_FOUND);
		//return null;	
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
		    
		    // Fill the code here
		Map<String,String>map=new HashMap<String, String>();
		for(FieldError error:ex.getBindingResult().getFieldErrors()) {
			map.put(error.getField(),error.getDefaultMessage());
		}
		
		 //   return new ResponseEntity<Object>
		return new ResponseEntity<Object>(map,HttpStatus.BAD_REQUEST);
	}
}