package surya.test.springbootbatch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String prefix;
	private String firstName;
	private String LastName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee() {
		super();
	}
	
	public Employee(Long id, String prefix, String firstName, String lastName) {
		super();
		this.id = id;
		this.prefix = prefix;
		this.firstName = firstName;
		LastName = lastName;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", prefix=" + prefix + ", firstName=" + firstName
				+ ", LastName=" + LastName + "]";
	}
	

}
