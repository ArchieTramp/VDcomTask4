import Method.NewDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task4 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "20612");
            NewDB.createDB(connection);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
