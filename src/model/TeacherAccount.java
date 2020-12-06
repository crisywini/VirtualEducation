package model;

/**
 * The Class TeacherAccount.
 */
public class TeacherAccount extends Account {

	/**
	 * Instantiates a new teacher account.
	 *
	 * @param person the person
	 * @param id     the id
	 * @param amount the amount
	 */
	public TeacherAccount(Person person, String id, double amount) {
		super(person, id, amount);
	}

	/**
	 * Instantiates a new teacher account.
	 *
	 * @param id the id
	 * @param ammount the ammount
	 */
	public TeacherAccount(String id, double ammount) {
		super(id, ammount);
	}

}
