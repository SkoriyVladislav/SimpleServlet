package by.epam.service;


import by.epam.service.impl.UserListServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserListService userListService = new UserListServiceImpl();

    private ServiceFactory() {

    }

    public UserListService getUserService() {
        return userListService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
