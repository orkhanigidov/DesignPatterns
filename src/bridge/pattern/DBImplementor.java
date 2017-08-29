package bridge.pattern;

public abstract class DBImplementor {
	
	public abstract void execute(String sqlQuery);
	public abstract void openConnection(String databaseName);
	
}
