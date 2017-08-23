package builder.pattern.two;

public class Director {
	
	public void construct(IBuilder builder){
		builder.buildBody();
		builder.insertWheels();
		builder.addHeadLights();
	}
	
}
