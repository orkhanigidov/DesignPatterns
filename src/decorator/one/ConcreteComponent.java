package decorator.one;

public class ConcreteComponent implements Component {
	
	@Override
	public void doJob() {
		System.out.println("Concrete Component - closed for modification");
	}
	
}
