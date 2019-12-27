package com.surya.test.springexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 5000517400652709205L;
	
	public EmployeeNotFoundException(int id) {
        super("Emp Not Found with Id "+id);
    }
	
	public EmployeeNotFoundException(String id) {
        super("Emp Not Found with string Id "+id);
    }
	
	
	public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
