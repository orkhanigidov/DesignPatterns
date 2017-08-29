package bridge.pattern;

public abstract class DBAbstraction {
	
	private DBImplementor implementor;

	public DBAbstraction(DBImplementor implementor) {
		setImplementor(implementor);
	}
	
	public DBImplementor getImplementor() {
		return implementor;
	}

	public void setImplementor(DBImplementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract void execute(String sqlQuery);
	public abstract void openConnection(String databaseName);
	
}
