package state.pattern;

public class Off extends RemoteControl {

	@Override
	public void pressSwitch(TV tv) {
		System.out.println("Now is ON");
		tv.setState(new On());
	}
	
}
