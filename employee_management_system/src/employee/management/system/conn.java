package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn() {
        try {
            // Load the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeemanagement", "postgres", "Password");

            // Create a statement object
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
