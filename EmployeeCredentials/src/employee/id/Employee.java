package employee.id;

public class Employee {
	
	 private String firstName;
	    private String lastName;
	    private String department;

	    public Employee(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getDepartment() {
	        return department;
	    }

}
