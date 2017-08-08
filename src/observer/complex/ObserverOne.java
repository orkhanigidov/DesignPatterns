package observer.complex;

public class ObserverOne implements IObserver {
	
	@Override
	public void update(int value) {
		System.out.println(ObserverOne.class.getSimpleName() + " value: " + value);
	}
	
}
