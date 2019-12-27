package com.surya.test.springexception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class EmployeController {
	
	
	@GetMapping("/{id}")
	public void throwNoEmployeeFoundException(@PathVariable("id") String id) throws  EmployeeNotFoundException
	{
		throw new EmployeeNotFoundException(id);
	}
	
	
	@GetMapping("/address}")
	public void throwNoAddressFoundException(@PathVariable("id") String id) throws AddressNotFoundException
	{
		throw new AddressNotFoundException("Address not exist.");
	}

}
