package builder.pattern.two;

public interface IBuilder {
	
	public void buildBody();
	public void insertWheels();
	public void addHeadLights();
	public Product getVehicle();
	
}
