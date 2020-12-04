package model;

public class Director extends Employee {
	/**
	 * 
	 * @param code
	 * @param name
	 * @param lastName
	 * @param salary
	 */
	private Course course;
	public Director(String code, String name, String lastName, double salary, Course course) {
		super(code, name, lastName, salary);
		this.course = course;
	}
	
	public Director() {
		super();
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Director [course=" + course + "]";
	}
}
