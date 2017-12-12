package springapp.web;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String name = request.getParameter("username");
        String role = request.getParameter("role");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        if (name == null || role == null)
        {
            response.getWriter().println("<html><body><p>Empty parameters.</p></body></html>");
        }
        else
        {
            response.getWriter().println("<html><body><p>Hello, " + name + " !</p><p>You sign in as " + role + " !</p></body></html>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       doGet(request, response);
    }

}