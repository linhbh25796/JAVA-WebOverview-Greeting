import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer =  response.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "pass".equals(password)){
            writer.println("<h1> Welcome "+username +" to website </h1>");
        }else {
            writer.println("<h1>Log in error! </h1>");
        }

        writer.println("</html>");
    }
}
