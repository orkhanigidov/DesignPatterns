package solid.open.closed.principle;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV();
		Radio radio = new Radio();
		
		RemoteControlImpl remote = new RemoteControlImpl(tv);
		remote.on();
		remote.off();
		
		remote = new RemoteControlImpl(radio);
		remote.on();
		remote.off();
	}

}
