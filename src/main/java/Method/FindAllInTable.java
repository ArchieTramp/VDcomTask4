package Method;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FindAllInTable {
    public static void showBG(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT id, name, price, creator FROM boardgame");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    public static void showST(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT id, name, price, forage FROM skilltoys");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
