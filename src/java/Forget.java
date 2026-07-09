/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(urlPatterns = {"/Forget"})
public class Forget extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        String email=request.getParameter("mail");
        String username=request.getParameter("username");
        
        out.println("<body style='background-color:#003333'>");
        out.println("<div align='center'>");
        out.println("<h1 style='text-align:center;color:red'>Reset Password</h1>");
        out.println("<form action='UpdatePassword'>");
        out.println("<pre>");
        out.println("<input style='color:black' type='text' name='name' value='"+username+"' readonly='true'>");
        out.println("<input style='color:black' type='email' name='mail' value='"+email+"' readonly='true'>");
        out.println("<input style='color:black' type='password' id='pwd1' name='pwd' placeholder='Enter new password'>");
        out.println("<input style='color:black' type='password' id='pwd2' placeholder='Enter confirm password'><span style='color:red' id='one'></span>");
        out.println("<input style='background-color:#cc99ff;color:black' type='submit' value='Update Password' onclick='return valid()'>");
        out.println("</pre>");
        out.println("</form>");
        out.println("<script src='" + request.getContextPath() + "/JS/Valid_password.js'></script>");
        out.println("</div>");
        out.println("</body>");
        
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
