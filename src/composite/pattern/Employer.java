package composite.pattern;

public abstract class Employer {
	
	public String fullname;
	public Position position;
	
	public Employer(String fullname, Position position){
		this.fullname = fullname;
		this.position = position;
	}
	
	public abstract void show();
	
}
