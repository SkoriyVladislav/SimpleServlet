package by.epam.service;


import by.epam.User.User;

import java.util.List;

public interface UserListService {
    List<User> createListUser(String name, String surname);
}
