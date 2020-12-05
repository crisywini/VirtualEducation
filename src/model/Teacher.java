package model;

import java.util.LinkedList;

/**
 * The Class Teacher.
 */
public class Teacher extends Employee {

	/** The account. */
	private TeacherAccount account;

	/** The courses. */
	private LinkedList<Course> courses;

	/** The school. */
	private VirtualSchool school;

	/**
	 * Instantiates a new teacher.
	 *
	 * @param code     the code
	 * @param name     the name
	 * @param lastName the last name
	 * @param salary   the salary
	 * @param account  the account
	 * @param school   the school
	 */
	public Teacher(String code, String name, String lastName, double salary, TeacherAccount account,
			VirtualSchool school) {
		super(code, name, lastName, salary);
		this.account = account;
		this.school = school;
		courses = new LinkedList<Course>();
	}

	/**
	 * Gets the account.
	 *
	 * @return the account
	 */
	public TeacherAccount getAccount() {
		return account;
	}

	/**
	 * Sets the account.
	 *
	 * @param account the new account
	 */
	public void setAccount(TeacherAccount account) {
		this.account = account;
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
	 * Gets the school.
	 *
	 * @return the school
	 */
	public VirtualSchool getSchool() {
		return school;
	}

	/**
	 * Sets the school.
	 *
	 * @param school the new school
	 */
	public void setSchool(VirtualSchool school) {
		this.school = school;
	}

}
