package observer.pattern.one;

public interface ISubject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObservers(int index);
	
}
