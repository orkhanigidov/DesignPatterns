package facade.pattern;

public class FacadeTest {
	public static void main(String[] args) {
		RobotFacade facade = new RobotFacade();
		facade.constructRobot("Dark Blue", "Steel");
	}
}
