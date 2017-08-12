package strategy.pattern;

public class StrategyTest {
	
	public static void main(String[] args) {
		
		Logger logger = new Logger();
		
		logger.setStrategy(new LogToDatabase());
		logger.debug("test1");
		logger.info("test2");
		logger.error("test3");
		
		logger.setStrategy(new LogToFile());
		logger.debug("test4");
		logger.info("test5");
		logger.error("test6");
		
	}
	
}
