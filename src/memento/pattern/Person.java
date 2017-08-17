package memento.pattern;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public PersonMemento createMemento(){
		return new PersonMemento(getName(), getSurname(), getAge());
	}
	
	public void bindMemento(PersonMemento person){
		setName(person.getName());
		setSurname(person.getSurname());
		setAge(person.getAge());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
