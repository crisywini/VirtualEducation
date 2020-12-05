package model;

import java.util.LinkedList;

/**
 * The Class Student.
 */
public class Student extends Person {
	
	/** The registers. */
	private LinkedList<Register> registers;
	
	/** The account. */
	private StudentAccount account;

	/**
	 * Instantiates a new student.
	 *
	 * @param code the code
	 * @param name the name
	 * @param lastName the last name
	 * @param account the account
	 */
	public Student(String code, String name, String lastName, StudentAccount account) {
		super(code, name, lastName);
		this.registers = new LinkedList<Register>();
	}

	/**
	 * Gets the account.
	 *
	 * @return the account
	 */
	public StudentAccount getAccount() {
		return account;
	}

	/**
	 * Sets the account.
	 *
	 * @param account the new account
	 */
	public void setAccount(StudentAccount account) {
		this.account = account;
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
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(Person o) {
		int comparation = 0;
		String nameOther = o.getName();
		int auxiliarComparation = nameOther.compareTo(getName());
		if (auxiliarComparation < 0) {
			comparation = -1;
		} else if (auxiliarComparation > 0) {
			comparation = 1;
		}
		return comparation;
	}
}
