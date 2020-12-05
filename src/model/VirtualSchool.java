package model;

import java.util.ArrayList;

/**
 * The Class VirtualSchool.
 */
public class VirtualSchool {

	/** The name. */
	private String name;

	/** The teachers. */
	private ArrayList<Teacher> teachers;
	
	/** The directors. */
	private ArrayList<Director> directors;
	
	/** The students. */
	private ArrayList<Student> students;
	
	/** The courses. */
	private ArrayList<Course> courses;

	/**
	 * Instantiates a new virtual school.
	 *
	 * @param name the name
	 */
	public VirtualSchool(String name) {
		teachers = new ArrayList<Teacher>();
		directors = new ArrayList<Director>();
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(ArrayList<Director> directors) {
		this.directors = directors;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
}
