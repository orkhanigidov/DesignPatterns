package observer.pattern.two;

public class ObserverTwo implements IObserver {

	@Override
	public void update(int value) {
		System.out.println(ObserverTwo.class.getSimpleName() + " value: " + value);
	}
	
}
