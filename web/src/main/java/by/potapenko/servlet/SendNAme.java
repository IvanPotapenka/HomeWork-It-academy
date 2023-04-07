package by.potapenko.servlet;

import by.potapenko.model.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/sendname")
public class SendNAme extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object attribute = req.getAttribute("user");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        if (attribute == null) {
            session.setAttribute("user", new User(name, surname));
            doGet(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/SaveUser.jsp").forward(req, resp);
    }
}


