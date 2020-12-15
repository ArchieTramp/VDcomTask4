package Method;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class NewDB {
    public static void createDB(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(
                    "DROP TABLE IF EXISTS boardgame;"
                            + "DROP TABLE IF EXISTS skilltoys;"
                            + "\n"
                            + "CREATE TABLE boardgame (\n"
                            + "id bigserial primary key,\n"
                            + "name varchar(100) NOT NULL, \n"
                            + "price integer NOT NULL, \n"
                            + "creator varchar(100) NOT NULL);"
                            + "\n"
                            + "INSERT INTO boardgame (name, price, creator)\n"
                            + "VALUES\n"
                            + "('GoT', 4000, 'HW'),\n"
                            + "('Munchkin', 2000, 'SJG'),\n"
                            + "('Monopoly', 2500, 'Hasbro'),\n"
                            + "('Hive', 1000, 'gen24');"
                            + "\n"
                            + "CREATE TABLE skilltoys (\n"
                            + "id bigserial primary key,\n"
                            + "name varchar(100) NOT NULL, \n"
                            + "price integer NOT NULL, \n"
                            + "forAge integer NOT NULL);"
                            + "\n"
                            + "INSERT INTO skilltoys (name, price, forAge)\n"
                            + "VALUES\n"
                            + "('Yoyo', 500, 14),\n"
                            + "('Diabolo', 1000, 18),\n"
                            + "('Pogostick', 1200, 16);\n"
                            + "\n");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        {

        }
    }
}
