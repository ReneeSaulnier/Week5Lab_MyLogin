/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author Renee
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       HttpSession session = request.getSession(); 
       String action = request.getParameter("logout");
       User user = (User) session.getAttribute("user");
       
       if(action != null){
           session.invalidate();
           request.setAttribute("errorMessage", "You have logged out");
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
       } else if(user != null){
           response.sendRedirect("home");
       } else{
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username == null || password == null || username.equals("") || password.equals("")){
            request.setAttribute("errorMessage", "Please enter your credientials");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        User user = new AccountService().login(username, password);
        
        if(user == null){
            request.setAttribute("errorMessage", "Please enter your credientials");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        }else{
            session.setAttribute("user", user);
            response.sendRedirect("home");
        }
    }
       

//        if(user != null){
//            session = request.getSession();
//            session.setAttribute("user", user);
//            response.sendRedirect("home");
//        } 
////        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);   
//    }

   } 
}
