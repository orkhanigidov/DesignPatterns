package state.pattern;

public class On extends RemoteControl {

	@Override
	public void pressSwitch(TV tv) {
		System.out.println("Now is OFF");
		tv.setState(new Off());
	}
	
}
