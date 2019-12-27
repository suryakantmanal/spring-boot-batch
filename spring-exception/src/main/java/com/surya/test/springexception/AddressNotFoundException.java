package com.surya.test.springexception;



public class AddressNotFoundException extends Exception {

	private static final long serialVersionUID = -6787045940324281140L;
	
	public AddressNotFoundException(String message) {
        super(message);
    }
	
	
	public AddressNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
