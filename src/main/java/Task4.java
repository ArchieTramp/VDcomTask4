import Method.NewDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Artur Gilyazov
 * Необходимо реализовать веб-приложение, которое хранит одну сущность (набор
 * атрибутов сущности на выбор кандидата).
 * Приложение должно обладать следующей функциональностью:
 * 1. Хранить список всех сущностей в базе данных;
 * 2. Выводить все сущности в браузере (в виде таблицы или любого другого
 * представления);
 * 3. Иметь возможность редактировать/добавлять/удалять экземпляры;
 * 4. Иметь возможность загружать данные в формате csv (выбор разделителя не
 * существенен);
 * Приложение должно быть stand-alone, т.е. не требовать установки в какое-либо
 * окружение, либо дополнительных действий по настройке.
 */

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
