package model;

import java.util.LinkedList;

/**
 * The Class VirtualSchool.
 */
public class VirtualSchool {

	/** The name. */
	private String name;

	/** The teachers. */
	private LinkedList<Teacher> teachers;
	
	/** The directors. */
	private LinkedList<Director> directors;
	
	/** The students. */
	private LinkedList<Student> students;
	
	/** The courses. */
	private LinkedList<Course> courses;

	/**
	 * Instantiates a new virtual school.
	 *
	 * @param name the name
	 */
	public VirtualSchool(String name) {
		teachers = new LinkedList<Teacher>();
		directors = new LinkedList<Director>();
		courses = new LinkedList<Course>();
		students = new LinkedList<Student>();
		this.name = name;
	}

	/**
	 * Gets the teachers.
	 *
	 * @return the teachers
	 */
	public LinkedList<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Sets the teachers.
	 *
	 * @param teachers the new teachers
	 */
	public void setTeachers(LinkedList<Teacher> teachers) {
		this.teachers = teachers;
	}

	/**
	 * Gets the directors.
	 *
	 * @return the directors
	 */
	public LinkedList<Director> getDirectors() {
		return directors;
	}

	/**
	 * Sets the directors.
	 *
	 * @param directors the new directors
	 */
	public void setDirectors(LinkedList<Director> directors) {
		this.directors = directors;
	}

	/**
	 * Gets the students.
	 *
	 * @return the students
	 */
	public LinkedList<Student> getStudents() {
		return students;
	}

	/**
	 * Sets the students.
	 *
	 * @param students the new students
	 */
	public void setStudents(LinkedList<Student> students) {
		this.students = students;
	}

	/**
	 * Gets the courses.
	 *
	 * @return the courses
	 */
	public LinkedList<Course> getCourses() {
		return courses;
	}

	/**
	 * Sets the courses.
	 *
	 * @param courses the new courses
	 */
	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
