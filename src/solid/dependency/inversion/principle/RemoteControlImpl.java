package solid.dependency.inversion.principle;

public class RemoteControlImpl {

	private RemoteControl remoteControl;
	
	public RemoteControlImpl(RemoteControl remoteControl){
		this.remoteControl = remoteControl;
	}
	
	public void on() {
		remoteControl.on();
	}

	public void off() {
		remoteControl.off();
	}
	
}
