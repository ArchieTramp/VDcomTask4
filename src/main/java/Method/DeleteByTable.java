package Method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteByTable {
    public static void delete(Connection connection) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM boardgame WHERE name = ?");
            preparedStatement.setString(1, "Hive");
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
