/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CTO;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import modelo.Aspirante;
import modelo.Curso;
import modelo.DATA;
import static modelo.DATA.cursos;

/**
 *
 * @author Estudiante
 */
@WebServlet(name = "AspiranteCTO", urlPatterns = {"/AspiranteCTO"})
public class AspiranteCTO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AspiranteCTO</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AspiranteCTO at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String[] materiassleccionadas = request.getParameterValues("materia");
        String nombre = request.getParameter("txtNombre");
        String email = request.getParameter("txtEmail");
        String telefono = request.getParameter("txtTelefono");

        Aspirante asp = new Aspirante();
        asp.setNombre(nombre);
        asp.setCorreo(email);
        asp.setTelefono(telefono);
        if (materiassleccionadas != null) {
            List<String> materias = Arrays.asList(materiassleccionadas);
            asp.setMaterias(materias);
        }
        LocalDate fecha_actual=LocalDate.now();
        asp.setFecha(fecha_actual);
        
        DATA.aspirantes.add(asp);
        
        if(asp.getMaterias()!=null){
            for(String materiasseleccionada : materiassleccionadas){
                for(Curso c : cursos ){
                    if(c.getCurso().equals(materiasseleccionada)){
                        String nombre_curso= c.getCurso();
                        String id_curso=Integer.toString(c.getId());
                        String valor_curso=String.valueOf(c.getValor());
                    }
                }
            }
        }
        
        
        response.sendRedirect("salida.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
