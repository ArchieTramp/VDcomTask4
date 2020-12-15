package Method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditInTable {
    public static void update(Connection connection) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE skilltoys " +
                    "SET price = ? " +
                    "WHERE id = ?");
            preparedStatement.setInt(1, 600);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
