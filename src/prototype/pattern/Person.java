package prototype.pattern;

public class Person implements IPrototype {

	private String personName;
	private String personBirthDate;
	
	public Person() {
	}

	public Person(String personName, String personBirthDate) {
		this.personName = personName;
		this.personBirthDate = personBirthDate;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonBirthDate() {
		return personBirthDate;
	}

	public void setPersonBirthDate(String personBirthDate) {
		this.personBirthDate = personBirthDate;
	}

	@Override
	public IPrototype cloneObject() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
	
}
