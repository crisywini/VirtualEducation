package model;

import java.util.LinkedList;

public class Subject {
	
	private String id;
	private String name;
	private LinkedList<Course> courses;
	private LinkedList<Student> students;
	
	public Subject(String id, String name, LinkedList<Course> courses, LinkedList<Student> students) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.students = students;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Course> getCourses() {
		return courses;
	}
	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}
	public LinkedList<Student> getStudents() {
		return students;
	}
	public void setStudents(LinkedList<Student> students) {
		this.students = students;
	}
	
}
