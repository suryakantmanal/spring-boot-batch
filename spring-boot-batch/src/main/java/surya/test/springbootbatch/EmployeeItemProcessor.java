package surya.test.springbootbatch;

import org.springframework.batch.item.ItemProcessor;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
		
		String firstName = item.getFirstName().toUpperCase();
		Employee convertedEmp = new Employee(item.getId(), item.getPrefix(), 
				firstName, item.getLastName());
		return convertedEmp;
	}

}
