package by.epam.service.impl;


import by.epam.DAO.DAOFactory;
import by.epam.DAO.UserDAO;
import by.epam.User.User;
import by.epam.service.UserListService;

import java.util.List;

public class UserListServiceImpl implements UserListService {

    @Override
    public List<User> createListUser(String name, String surname) {
        DAOFactory factory = DAOFactory.getInstance();
        UserDAO applianceDAO = factory.getUserDAO();

        List<User> list = applianceDAO.createListUser(name, surname);

        return list;
    }
}
