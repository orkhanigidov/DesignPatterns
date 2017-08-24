package flyweight.pattern;

public class FlyweightTest {
	public static void main(String[] args) {
		
		try {
			
			RobotFactory factory = new RobotFactory();
			IRobot robot = factory.getRobotFromFactory("small");
			robot.print();
			
			for (int i = 0; i < 2; i++) {
				robot = factory.getRobotFromFactory("small");
				robot.print();
			}
			
			System.out.println("Objects created: " + factory.totalObjectsCreated());
			
			for (int i = 0; i < 5; i++) {
				robot = factory.getRobotFromFactory("large");
				robot.print();
			}
			
			System.out.println("Objects created: " + factory.totalObjectsCreated());
			
		} catch (Exception e) {
		}
		
	}
}
