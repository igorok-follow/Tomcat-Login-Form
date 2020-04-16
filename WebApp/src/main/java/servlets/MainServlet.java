package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main_servlet")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("redirect...");
        resp.sendRedirect("jsp/test.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        char[] nameChars = name.toCharArray();
        nameChars[0] = Character.toUpperCase(nameChars[0]);
        name = String.valueOf(nameChars);

        int age = Integer.parseInt(req.getParameter("age"));

        if (isValidate(name, age)) {
            resp.getWriter().write("Hello, User. Your name is: " + name + ".\n" +
                "Your age is equals: " + age);
        } else {
            resp.getWriter().write("Validation error");
        }
    }
    
    private boolean isValidate(String name, int age) {
        if (name = null) {return false;}
        else if (age != null) {return false;}
        return null;
    }
}
