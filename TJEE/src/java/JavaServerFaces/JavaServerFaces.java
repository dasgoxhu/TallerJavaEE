package JavaServerFaces;

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
@WebServlet(name = "javaserverfaces", urlPatterns = {"/Javaserverfaces"})
public class JavaServerFaces extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>JavaServerFaces</title>");
        out.println("</head>");
        out.println("<body style='background-color:red'>");
        out.println("<h1>JavaServer Faces</h1>");
        out.println("<div><p><b><i>Framework para aplicaciones Java basadas en web que simplifica el desarrollo de interfaces de usuario en aplicaciones Java EE</i></b></p></div>");
        out.println("</body>");
        out.println("</html>");
    }
}
