package strategy.pattern;

public class Logger implements ILogStrategy {

	private ILogStrategy logger;
	
	public void setStrategy(ILogStrategy logger){
		this.logger = logger;
	}
	
	@Override
	public void debug(String log) {
		logger.debug(log);
	}

	@Override
	public void info(String log) {
		logger.info(log);
	}	

	@Override
	public void error(String log) {
		logger.error(log);
	}
	
}
