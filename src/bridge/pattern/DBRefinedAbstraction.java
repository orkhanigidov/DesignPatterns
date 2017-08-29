package bridge.pattern;

public class DBRefinedAbstraction extends DBAbstraction {
	
	public DBRefinedAbstraction(DBImplementor implementor) {
		super(implementor);
	}
	
	@Override
	public void execute(String sqlQuery) {
		super.getImplementor().execute(sqlQuery);
	}
	
	@Override
	public void openConnection(String databaseName) {
		super.getImplementor().openConnection(databaseName);
	}
	
}
