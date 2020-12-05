package model;

import java.util.ArrayList;

import customExceptions.NullEntityException;

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

	public void addCourse(String id, String name, String description, Teacher teacher) throws NullEntityException {
		if (courses.size() > 0) {
			int index = searchCourse(id);
			if (index != -1) {
				throw new NullEntityException("The course with id: " + id + " already exists!");
			}
		}
		courses.add(new Course(id, name, description, teacher, this));
	}

	private int searchCourse(String idCourse, int low, int high) {
		int mid = (low + high) / 2;
		if (high < low) {
			return -1;
		}
	
		if (courses.get(mid).getId().equals(idCourse)) {
			return mid;
		} else if (Integer.parseInt(idCourse)< Integer.parseInt(courses.get(mid).getId())) {
			return searchCourse(idCourse, low, mid - 1);
		}
		return searchCourse(idCourse, mid + 1, high);
	}

	public int searchCourse(String idCourse) {
		return searchCourse(idCourse, 0, courses.size()-1);
	}

}
