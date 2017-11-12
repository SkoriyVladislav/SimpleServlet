package by.epam.DAO;

import by.epam.DAO.impl.UserDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO entityDAO = new UserDAOImpl();

    private DAOFactory() {}

    public UserDAO getUserDAO() {
        return entityDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
