package state.pattern;

public class StateTest {
	public static void main(String[] args) {
		
		Off initialState = new Off();
		TV tv = new TV(initialState);
		
		tv.pressButton();
		tv.pressButton();
		tv.pressButton();
		
	}
}
