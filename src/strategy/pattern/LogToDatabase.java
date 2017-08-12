package strategy.pattern;

public class LogToDatabase implements ILogStrategy {

	@Override
	public void debug(String log) {
		System.out.println("Database DEBUG: " + log);
	}

	@Override
	public void info(String log) {
		System.out.println("Database INFO: " + log);
	}
	
	@Override
	public void error(String log) {
		System.out.println("Database ERROR: " + log);
	}
}
