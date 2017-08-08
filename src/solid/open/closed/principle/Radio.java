package solid.open.closed.principle;

public class Radio implements RemoteControl {

	@Override
	public void on() {
		System.out.println("Radio on");
	}

	@Override
	public void off() {
		System.out.println("Radio off");
	}

}
