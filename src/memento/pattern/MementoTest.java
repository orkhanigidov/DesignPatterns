package memento.pattern;

public class MementoTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("Sanani", "Racabov", 22);
		
		System.out.println("Name: " + person.getName());
		
		PersonMemory memory = new PersonMemory();
		memory.setPersonCopy(person.createMemento());
		
		person.setName("Sarxan");
		person.setAge(21);
		System.out.println("Name: " + person.getName());
		
		person.bindMemento(memory.getPersonCopy());
		System.out.println("Name: " + person.getName());
		
	}
	
}
