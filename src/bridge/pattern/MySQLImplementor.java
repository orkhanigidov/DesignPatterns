package bridge.pattern;

public class MySQLImplementor extends DBImplementor {
	
	@Override
	public void execute(String sqlQuery) {
		System.out.println("Query executed: " + sqlQuery);
	}
	
	@Override
	public void openConnection(String databaseName) {
		System.out.println(databaseName + " opened");
	}
	
}
