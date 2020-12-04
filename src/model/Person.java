package model;

public abstract class Person implements Comparable<Person>{
    private String code;
    private String name;
    private String lastName;

    public Person(String code, String name, String lastName){
    	this.code = code;
    	this.name = name;
    	this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Person [code=" + code + ", name=" + name + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	/**
	 * This method allows to get compare between the code and o.code based on:
	 * 	@return if code is minor than o.code then it will return -1
	 * 			if code is major than o.code then it will return 1
	 * 			if both codes are equal, return 0
	 */
	@Override
	public int compareTo(Person o) {
		int comparation = 0;
		int code = Integer.parseInt(o.getCode());
		int thisCode = Integer.parseInt(this.code);
		if (thisCode < code) {
			comparation = -1;
		} else if (thisCode > code) {
			comparation = 1;
		}
		return comparation;
	}
}
