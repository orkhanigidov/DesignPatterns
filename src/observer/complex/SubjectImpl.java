package observer.complex;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubject {

	private int value;
	private List<IObserver> observerList = new ArrayList<>();
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers(value);
	}

	@Override
	public void register(IObserver o) {
		observerList.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(int value) {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(value);
		}
	}

}
