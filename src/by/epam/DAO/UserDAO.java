package by.epam.DAO;

import by.epam.User.User;

import java.util.List;

public interface UserDAO {
    List<User> createListUser(String name, String surname);
}
