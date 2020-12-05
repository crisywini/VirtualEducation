package model.util;

import model.Director;
import model.Employee;
import model.Person;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("1", "Crisi", "s??nchez", 5000000);
		BinaryTree<Person> employees = new BinaryTree<Person>(employee);
		employees.add(new Employee("2", "Crisi", "S??nchez", 123.3));
		employees.add(new Employee("-1", "Crisi", "S??nchez", 123.3));
		employees.add(new Employee("3", "Crisi", "S??nchez", 123.3));
		System.out.println(employees.getPreOrder().toString());
	}

}
