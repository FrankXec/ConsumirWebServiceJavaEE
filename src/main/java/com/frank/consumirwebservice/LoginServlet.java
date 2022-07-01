
package com.frank.consumirwebservice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(value = "/Login")
public class LoginServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String name = req.getParameter("name");
        String pass = req.getParameter("password");
        
        if(name.equals("Francisco") && pass.equals("hackers5")){
            HttpSession session = req.getSession();
            session.setAttribute("userName", name);
            res.sendRedirect("welcome.jsp");
        }else{
            res.sendRedirect("login.jsp");
        }
        
        /*DESLOGUEARSE, MEJOR HACERLO EN OTRO SERVLET
        HttpSession session = req.getSession();
        session.removeAttribute("userName", name);
        session.invalidate();
        res.sendRedirect("login.jsp");
        */
    }
}
