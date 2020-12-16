package Connection;

import javax.ejb.EJB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Класс создан для удобства передачи connection в другие методы, используется не во всех классах,
 * в связи с более поздней реализацией, нежели основное тело программы, принял решение в тестовом проекте
 * не переписывать лишний раз код.
 */

@EJB
public class ConnectionManagerJDBC implements ConnectionManager {
    @Override
    public Connection getConnection() {
        Connection connection = null;
        try { Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "20612");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
