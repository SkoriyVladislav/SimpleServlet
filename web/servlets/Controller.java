package servlets;

import by.epam.User.User;
import by.epam.service.ServiceFactory;
import by.epam.service.UserListService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        ServiceFactory factory = ServiceFactory.getInstance();
        UserListService service = factory.getUserService();
        List<User> users = service.createListUser(name, surname);

        request.setAttribute("users", users);
        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }



}
