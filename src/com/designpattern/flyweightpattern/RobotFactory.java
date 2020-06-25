package com.designpattern.flyweightpattern;
import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	Map<String, ISayHello> robotsMap = new HashMap<String, ISayHello>();

	public int totalObjects() {
		return robotsMap.size();
	}

	public ISayHello createRobot(String type) throws Exception {
		ISayHello result = null;
		if (robotsMap.containsKey(type)) {
			result = robotsMap.get(type);
		} else {
			switch (type) {
			case "small":
				result = new SmallRobot();
				robotsMap.put(type, result);
				break;
			case "large":
				result = new LargeRobot();
				robotsMap.put(type, result);
				break;
			default:
				throw new Exception("could not create the robot of type"+type);
			}
		}		
		return result;
	}
}
