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
@WebServlet(name = "Moto", urlPatterns = {"/Moto"})
public class Moto extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Honda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cb190</h1>");
            out.println("<img src='Imagenes/1.jpg'>");
            out.println("<p>TIPO DE MOTOR\n" +
                        "4T OHC – Refri. por aire,CILINDRAJE\n" +
                        "184.4 cc, TIPO DE ARRANQUE\n" +
                        "Eléctrico,TIPO DE TRANSMISIÓN\n" +
                        "5 velocidades. </p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

