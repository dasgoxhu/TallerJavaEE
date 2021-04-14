package MuestrarioMotocicletas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "moto2", urlPatterns = {"/moto2"})
public class moto2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Yamaha</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mt09</h1>");
            out.println("<img src='Imagenes/2.jpg'>");
            out.println("<p>TIPO DE MOTOR\n" +
            "4T DOHC – Refri. por liquido,CILINDRAJE 847 cc, TIPO DE ARRANQUE\n" +
            "Eléctrico,TIPO DE TRANSMISIÓN\n" +
            "6 velocidades.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

