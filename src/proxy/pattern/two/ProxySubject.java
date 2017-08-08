package proxy.pattern.two;

public class ProxySubject extends AbstractSubject {
	
	private Subject subject;
	
	@Override
	public void showSubjectName() {
		System.out.println("Proxy calling");
		
		if(subject == null){
			subject = new Subject();
		}
		
		subject.showSubjectName();
	}
	
}	
