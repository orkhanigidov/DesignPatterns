package solid.dependency.inversion.principle;

public class TV implements RemoteControl {

	@Override
	public void on() {
		System.out.println("TV on");
	}

	@Override
	public void off() {
		System.out.println("TV off");
	}

}
