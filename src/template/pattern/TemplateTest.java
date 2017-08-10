package template.pattern;

public class TemplateTest {
	
	public static void main(String[] args) {
		
		ComputerScience cs = new ComputerScience();
		ITEngineering it = new ITEngineering();
		Electronics es = new Electronics();
		
		cs.schedule();
		it.schedule();
		es.schedule();
		
	}
	
}
