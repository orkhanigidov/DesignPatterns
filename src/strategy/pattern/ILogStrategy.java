package strategy.pattern;

public interface ILogStrategy {
	
	public void debug(String log);
	public void info(String log);
	public void error(String log);
	
}
