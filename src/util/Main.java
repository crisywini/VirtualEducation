package util;

import model.Director;
import model.Employee;
import model.Person;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("1", "Crisi", "sánchez", 5000000);
		BinaryTree<Person> employees = new BinaryTree<Person>(employee);
		employees.add(new Employee("2", "Crisi", "Sánchez", 123.3));
		employees.add(new Employee("-1", "Crisi", "Sánchez", 123.3));
		employees.add(new Employee("3", "Crisi", "Sánchez", 123.3));
		System.out.println(employees.getInOrder());
	}

}
