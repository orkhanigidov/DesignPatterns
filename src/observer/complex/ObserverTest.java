package observer.complex;

public class ObserverTest {
	
	public static void main(String[] args) {
		
		IObserver one = new ObserverOne();
		IObserver two = new ObserverTwo();
		IObserver three = new ObserverThree();
		SubjectImpl subject = new SubjectImpl();
		
		subject.register(one);
		subject.register(two);
		subject.register(three);
		subject.setValue(10);
		System.out.println();
		
		subject.unregister(one);
		subject.unregister(two);
		subject.setValue(20);
		System.out.println();
		
		subject.register(one);
		subject.register(two);
		subject.setValue(30);
		
	}
	
}
