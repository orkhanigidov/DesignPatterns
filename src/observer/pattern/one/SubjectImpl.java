package observer.pattern.one;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubject {

	private int flag;
	private List<Observer> observerList = new ArrayList<>(); 
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers(flag);
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(int index) {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(index);
		}
	}

}
