package Method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddToTable {
    public static void add(Connection connection) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO boardgame (name, price, creator)\n" +
                            "VALUES\n" +
                            "(?, ?, ?)");
            preparedStatement.setString(1, "Evolution");
            preparedStatement.setInt(2, 800);
            preparedStatement.setString(3, "HGW");
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
