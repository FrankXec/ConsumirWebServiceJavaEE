
package com.frank.consumirwebservice;

import com.frank.consumirwebservice.dto.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DemoJstl")
public class JSTLServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String name = "Francisco";
        User user = new User(1L,"Francisco");
        
        req.setAttribute("label", name);
        req.setAttribute("user", user);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("jstl.jsp");
        dispatcher.forward(req, res);
    }
}
