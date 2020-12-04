package model;

import java.util.Comparator;

/**
 * The Class PersonComparator.
 */
public class PersonComparator implements Comparator<Person> {

	/**
	 * Compare.
	 *
	 * @param o1 the o 1
	 * @param o2 the o 2
	 * @return the int
	 */
	@Override
	public int compare(Person o1, Person o2) {
		int comparation = 0;
		String name1 = o1.getName();
		String name2 = o2.getName();
		int aux = name1.compareTo(name2);
		if (aux < 0) {
			comparation = -1;
		} else if (aux > 0) {
			comparation = 1;
		}
		return comparation;
	}

}
