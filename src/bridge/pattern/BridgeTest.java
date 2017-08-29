package bridge.pattern;

public class BridgeTest {
	public static void main(String[] args) {
		
		DBAbstraction mysql = new DBRefinedAbstraction(new MySQLImplementor());
		mysql.openConnection("users");
		mysql.execute("SELECT * FROM users");
		
		DBAbstraction oracle = new DBRefinedAbstraction(new OracleImplementor());
		oracle.openConnection("users");
		oracle.execute("SELECT * FROM users");
		
	}
}
