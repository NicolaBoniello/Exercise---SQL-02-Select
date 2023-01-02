package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Students {
    static final String DB_URL= "jdbc:mysql://localhost:3306/newdb";
    static final String USER= "root";
    static final String PASSWORD = "Milanista1997";

    public void printValueOfTable() throws SQLException {
        Connection conn = null;

        conn= DriverManager.getConnection(DB_URL,USER,PASSWORD);
        Statement statement = conn.createStatement();

        String printQueryName = """
                SELECT  first_name, last_name FROM students
                """;

        ResultSet resultSet = statement.executeQuery(printQueryName);

        ArrayList<String> surname = new ArrayList<>();

        while (resultSet.next()){
            surname.add(resultSet.getString("last_name"));
            System.out.println(resultSet.getString("first_name"));
        }

            for (String surnames : surname
            ) {
                System.out.println("the surname is: " + surnames);
            }
    }
}
