package facade.pattern;

public class RobotFacade {
	
	private RobotBody robotBody;
	private RobotColor robotColor;
	private RobotMetal robotMetal;
	
	public RobotFacade(){
		this.robotBody = new RobotBody();
		this.robotColor = new RobotColor();
		this.robotMetal = new RobotMetal();
	}
	
	public void constructRobot(String color, String metal){
		robotBody.createBody();
		robotColor.setColor(color);
		robotMetal.setMetal(metal);
		System.out.println("--Robot Created--");
	}
	
}
