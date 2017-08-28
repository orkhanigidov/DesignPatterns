package composite.pattern;

public class LeafEmployer extends Employer {
	
	public LeafEmployer(String fullname, Position position) {
		super(fullname, position);
	}
	
	@Override
	public void show() {
		System.out.println("Fullname: " + super.fullname + ", Position: " + super.position);
	}
	
}
