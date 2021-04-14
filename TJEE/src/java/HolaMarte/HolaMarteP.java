package HolaMarte;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author dasgo
 */
@WebServlet(name = "HolaMarteP", urlPatterns = {"/HolaMarteP"})
public class HolaMarteP extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Marte</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p><b><i>Hola Marte: Powered by the Perseverance</i></b></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
