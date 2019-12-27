package com.surya.test.springexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllException()
	{
		ErrorResponse errorResp = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Something Went Wrong.");
		return new ResponseEntity<>(errorResp,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException ex)
	{
		ErrorResponse errorResp = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getLocalizedMessage());
		return new ResponseEntity<>(errorResp,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(AddressNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleAddressNotFoundException()
	{
		ErrorResponse errorResp = new ErrorResponse(HttpStatus.EXPECTATION_FAILED.value(), "Expectation Failed.");
		return new ResponseEntity<>(errorResp,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
