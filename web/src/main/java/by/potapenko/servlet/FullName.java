package by.potapenko.servlet;

import by.potapenko.model.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/fullname")
public class FullName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter message = resp.getWriter();
        User user = (User) req.getSession().getAttribute("user");
        if (user != null) {
            message.println("Welcome " + user.getName() + " " + user.getSurname());
        } else {
            message.println("You dont enter yet!");
        }
    }
}

