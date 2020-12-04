package model;

import java.util.LinkedList;

/**
 * The Class Course.
 */
public class Course {

	/** The director. */
	private Director director;
	
	/** The subjects. */
	private LinkedList<Subject> subjects;
	
	/** The id. */
	private String id;

	/**
	 * Instantiates a new course.
	 *
	 * @param id the id
	 * @param directo the directo
	 */
	public Course(String id, Director directo) {
		this.id = id;
		subjects = new LinkedList<Subject>();
	}

	/**
	 * Gets the subjects.
	 *
	 * @return the subjects
	 */
	public LinkedList<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * Sets the subjects.
	 *
	 * @param subjects the new subjects
	 */
	public void setSubjects(LinkedList<Subject> subjects) {
		this.subjects = subjects;
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
	 * Gets the director.
	 *
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * Sets the director.
	 *
	 * @param director the new director
	 */
	public void setDirector(Director director) {
		this.director = director;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", id=" + id + "]";
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
