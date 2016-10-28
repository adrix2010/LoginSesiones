/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "CerrarSes", urlPatterns = {"/CerrarSes"})
public class CerrarSes extends HttpServlet {
      int estado;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        estado = Integer.parseInt(request.getParameter("estado"));
        HttpSession sesion = request.getSession();
        if(estado == 1)
      {
        sesion.invalidate();  
        response.sendRedirect("index.jsp");
      }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CerrarSes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sesion cerrada :)</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

   