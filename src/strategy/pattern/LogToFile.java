package strategy.pattern;

public class LogToFile implements ILogStrategy {

	@Override
	public void debug(String log) {
		System.out.println("File DEBUG: " + log);
	}

	@Override
	public void info(String log) {
		System.out.println("File INFO: " + log);
	}

	@Override
	public void error(String log) {
		System.out.println("File ERROR: " + log);
	}
	
	
	
}
