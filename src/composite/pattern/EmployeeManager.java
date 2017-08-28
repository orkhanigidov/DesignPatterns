package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager extends Employer {

	private List<Employer> employerList;
	
	public EmployeeManager(String fullname, Position position) {
		super(fullname, position);
		employerList = new ArrayList<>();
	}
	
	public void addEmployer(Employer employer){
		employerList.add(employer);
	}
	
	@Override
	public void show() {
		System.out.println("Fullname: " + super.fullname + ", Position: " + super.position);
		
		for(Employer employer : employerList) {
			employer.show();
		}
	}

}
