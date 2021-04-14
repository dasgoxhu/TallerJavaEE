package SpringMVC;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author dasgo
 */
@WebServlet(name = "SpringMvc", urlPatterns = {"/SpringMvc"})
public class SpringMvc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Spring MVC</title>");
        out.println("<Style> #caja{width: 50%; margin:20px;}                                                         </Style>");
        out.println("</head>");
        out.println("<body style='background-color:red'>");
        out.println("<button id='boton'>BOTON</button>");
        out.println("<div id='caja'>Spring MVC</div>");
        out.println("<script src='Scripts/BottonSpringMVC.js'></script>");
        out.println("</body>");
        out.println("</html>");
    }
}
