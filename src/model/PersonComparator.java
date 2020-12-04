package model;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

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
