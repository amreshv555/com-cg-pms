package com.cg.pms.in.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(AbstractUserNotFoundException.class)
	public ResponseEntity<Object> handleAbstractUserNotFoundException() {
		LOG.error("handleAbstractUserNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This user is NOT available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(AbstractUserAlreadyExistsException.class)
	public ResponseEntity<Object> handleAbstractUserAlreadyExistsException() {
		LOG.error("handleAbstractUserAlreadyExistsException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This user is already available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
	
}
