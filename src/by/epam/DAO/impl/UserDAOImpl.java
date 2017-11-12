package by.epam.DAO.impl;

import by.epam.DAO.UserDAO;
import by.epam.User.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private final static String URL = "jdbc:mysql://localhost:3306/entitybase";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private final static String FIND_USER = "SELECT * FROM users WHERE name = ? AND surname = ?";

    @Override
    public List<User> createListUser(String findName, String findSurname) {
        List<User> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("No databbase");
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER)) {
            preparedStatement.setString(1, findName);
            preparedStatement.setString(2, findSurname);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new User(resultSet.getString("name"),
                        resultSet.getString("surname"), resultSet.getString("phonenumber"),
                        resultSet.getString("e-mail")));
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return list;
    }
}
