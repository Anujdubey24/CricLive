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
@WebServlet(urlPatterns = {"/ForgetPasswordLink"})
public class ForgetPasswordLink extends HttpServlet {

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
     
     String to=request.getParameter("mail");
     String username=request.getParameter("username");
     
     String msg="Dear "+username+"\n\nWe received a request to reset your account password for the AD Web.\n\nTo reset your password, please click the secure link below:\n\n"+"http://localhost:8080/LOGIN/Forget?mail="+to+"&username="+username+"\n\nThis link will expire in 24 hours for security reasons. If you did not request a password reset, please ignore this email or contact the IT Support team immediately.\n\nThank you\n"+username+"\n\nSupport Team:\n\nEmail: anujdubeyad15@gmail.com\nContact: 9238522234";
     
     Mailer.send(to, "Password Reset Request - AD WEB", msg);
     
     out.println("<h1 style='text-align:center'>Dear "+username+"<br>The Password Reset Link has been sent to <span style='color:blueviolet;'>" + to + "</span></h1>");
     
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