package observer.pattern.one;

public class ObserverTest {
	
	public static void main(String[] args) {
		Observer observer1 = new Observer();
		Observer observer2 = new Observer();
		Observer observer3 = new Observer();
		SubjectImpl subject = new SubjectImpl();
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		subject.setFlag(1);
		
		subject.unregister(observer2);
		subject.setFlag(2);
		
	}
	
}
