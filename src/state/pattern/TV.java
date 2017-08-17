package state.pattern;

public class TV {
	
	private RemoteControl state;
	
	public TV(RemoteControl state) {
		setState(state);
	}
	
	public void pressButton(){
		state.pressSwitch(this);
	}

	public RemoteControl getState() {
		return state;
	}

	public void setState(RemoteControl state) {
		this.state = state;
	}
	
}
