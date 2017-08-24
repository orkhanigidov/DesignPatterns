package flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	
	Map<String, IRobot> shapes = new HashMap<>();
	
	public int totalObjectsCreated(){
		return shapes.size();
	}
	
	public IRobot getRobotFromFactory(String robotCategory) throws Exception {
		
		IRobot categoryOfRobot = null;
		
		if(shapes.containsKey(robotCategory)) {
			categoryOfRobot = shapes.get(robotCategory);
		} else {
			switch (robotCategory) {
			case "small":
				categoryOfRobot = new SmallRobot();
				shapes.put("small", categoryOfRobot);
				break;
			case "large":
				categoryOfRobot = new LargeRobot();
				shapes.put("large", categoryOfRobot);
				break;
			default:
				throw new Exception("Factory can create only small and large Robots");
			}
		}
		
		return categoryOfRobot;
	}
	
}
