package composite.pattern;

public class CompositeTest {
	public static void main(String[] args) {
		
		EmployeeManager ceo = new EmployeeManager("Sanani Racabov", Position.CEO);
		EmployeeManager cto = new EmployeeManager("Orxan Igidov", Position.CTO);
		EmployeeManager manager = new EmployeeManager("Sarxan Racabov", Position.Manager);
		
		manager.addEmployer(new LeafEmployer("Fuad Aliyev", Position.Employee));
		manager.addEmployer(new LeafEmployer("Ismail Ismailov", Position.Employee));
		
		cto.addEmployer(manager);
		ceo.addEmployer(cto);
		
		ceo.show();
		
	}
}
