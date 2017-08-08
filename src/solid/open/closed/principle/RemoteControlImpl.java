package solid.open.closed.principle;

public class RemoteControlImpl {

	private RemoteControl remoteControl;
	
	public RemoteControlImpl(RemoteControl remoteControl){
		this.remoteControl = remoteControl;
	}
	
//	public void on(Object obj){				This principle is false, because if we want add
//		if(obj instanceof TV){				new device, we should add new else if(), so we can control
//			((TV) obj).on();				these over interfaces
//		}
//		else if(obj instanceof Radio){
//			((Radio) obj).on();
//		}
//	}
//	
//	public void off(Object obj){
//		if(obj instanceof TV){
//			((TV) obj).off();
//		}
//		else if(obj instanceof Radio){
//			((Radio) obj).off();
//		}
//	}
	
	public void on() {
		remoteControl.on();
	}

	public void off() {
		remoteControl.off();
	}
	
}
