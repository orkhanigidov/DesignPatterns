package mediator.pattern;

public class Boss extends Friend {

	public Boss(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void send(String message){
		mediator.send(this, message);
	}
	
	public void notify(String message){
		System.out.println("Boss got message: " + message);
	}
	
}
