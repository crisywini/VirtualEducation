package model;

import java.util.LinkedList;


import model.util.BinaryTree;

/**
 * The Class Course.
 */
public class Course implements ICourse {

	/** The teacher. */
	private Teacher teacher;

	/** The registers. */
	private LinkedList<Register> registers;

	/** The students. */
	private BinaryTree<Person> students;

	/** The id. */
	private String id;

	/** The name. */
	private String name;

	/** The description. */
	private String description;

	/** The school. */
	private VirtualSchool school;

	/**
	 * Instantiates a new course.
	 *
	 * @param id          the id
	 * @param name        the name
	 * @param description the description
	 * @param teacher     the teacher
	 * @param students    the students
	 * @param school      the school
	 */
	public Course(String id, String name, String description, Teacher teacher, BinaryTree<Person> students,
			VirtualSchool school) {
		registers = new LinkedList<Register>();
		this.students = students;
		this.id = id;
		this.name = name;
		this.description = description;
		this.teacher = teacher;
		this.school = school;
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

	/**
	 * Gets the teacher.
	 *
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * Sets the teacher.
	 *
	 * @param teacher the new teacher
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * Gets the registers.
	 *
	 * @return the registers
	 */
	public LinkedList<Register> getRegisters() {
		return registers;
	}

	/**
	 * Sets the registers.
	 *
	 * @param registers the new registers
	 */
	public void setRegisters(LinkedList<Register> registers) {
		this.registers = registers;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
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

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the students.
	 *
	 * @return the students
	 */
	public BinaryTree<Person> getStudents() {
		return students;
	}

	/**
	 * Sets the students.
	 *
	 * @param students the new students
	 */
	public void setStudents(BinaryTree<Person> students) {
		this.students = students;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
