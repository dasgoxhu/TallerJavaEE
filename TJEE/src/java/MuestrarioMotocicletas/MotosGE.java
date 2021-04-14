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
@WebServlet(name = "MotosGE", urlPatterns = {"/MotosGE"})
public class MotosGE extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MotosGE</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Paginas</h1>");
            out.println("<ul><li>HONDA <a href='Moto'>Click aquí para entrar</a></li>");
            out.println("<ul><li>YAMAHA <a href='moto2'>Click aquí para entrar</a></li>");
            out.println("<ul><li>KAWASAKI <a href='moto3'>Click aquí para entrar</a></li>");
            out.println("</body>");
            out.println("</html>");
        }
    }

