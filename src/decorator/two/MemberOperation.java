package decorator.two;

public class MemberOperation implements IMemberOperation {

	@Override
	public void add() {
		System.out.println("Member added");
	}

	@Override
	public void remove() {
		System.out.println("Member removed");
	}

	
	
}
