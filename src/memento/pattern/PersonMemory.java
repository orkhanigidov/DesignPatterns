package memento.pattern;

public class PersonMemory {

	private PersonMemento personCopy;

	public PersonMemento getPersonCopy() {
		return personCopy;
	}

	public void setPersonCopy(PersonMemento personCopy) {
		this.personCopy = personCopy;
	}
	
}
