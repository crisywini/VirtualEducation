package model;

/**
 * The Class Employee.
 */
public class Employee extends Person {
	
	/** The salary. */
	private double salary;
	
	/**
	 * Instantiates a new employee.
	 *
	 * @param code the code
	 * @param name the name
	 * @param lastName the last name
	 * @param salary the salary
	 */
	public Employee(String code, String name, String lastName, double salary) {
		super(code, name, lastName);
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Sets the salary.
	 *
	 * @param salary the new salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Employee [ code="+this.getCode()+"]";
	}


	@Override
	public int compareTo(Person o) {
		int comparation = 0;
		int auxiliarCode1 =  Integer.parseInt(this.getCode());
		int auxiliarCode2 = Integer.parseInt(o.getCode());
		
		if(auxiliarCode1<auxiliarCode2) {
			comparation = -1;
		}else if(auxiliarCode1>auxiliarCode2) {
			comparation = 1;
		}
		
		return comparation;
	}

}
