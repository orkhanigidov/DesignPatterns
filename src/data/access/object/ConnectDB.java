package data.access.object;

import java.sql.Connection;

public class ConnectDB {

    private static Connection conn;

    public Connection getConnection() {
        return conn;
    }

}
