package mediator.pattern;

public abstract class Friend {
	
	public Mediator mediator;
	public String name;
	
	public Friend(Mediator mediator){
		this.mediator = mediator;
	}
	
}
