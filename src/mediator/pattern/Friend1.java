package mediator.pattern;

public class Friend1 extends Friend {

	public Friend1(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void send(String message){
		mediator.send(this, message);
	}
	
	public void notify(String message){
		System.out.println("Message Friend1 got: " + message);
	}
}
