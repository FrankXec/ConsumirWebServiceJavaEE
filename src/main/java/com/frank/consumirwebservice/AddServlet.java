
package com.frank.consumirwebservice;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/add") //con esta anotacion ya no es necesario crearlo y mapearlo en el web.xml
public class AddServlet extends HttpServlet{
    
    /*
    //dispatcher tendra siempre la misma direccion: ej: frank.com/add -> para todos los servlets
    //dispatcher utiliza session management
    //req.sendRedirect("servletname") //redirecciona directamente a ese server, diferente a dispatcher
    //HttpSession session = req.getSession(); //creamos una sesion para introducirle valores
    //session.setAttribute("name",value);
    
    //
    Cookie cookie = new Cookie("name",value(string))
    res.addCookie(cookie);
    //
    
    //ServletContext --> web.xml
    //ServletConfig --> web.xml
    funciones(){
        req.setAttribute("k",k)//asi podemos usar cualquier valor cuando hagamos un dispatcher
        
        RequestDispatcher rd = req.getRequestDispatcher("name") //nombrarlo y mapearlo en web.xml
        rd.forward(req,res)
    
    }
    */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        int i = Integer.parseInt(req.getParameter("numero1"));
        int j = Integer.parseInt(req.getParameter("numero1"));
        int k = i + j;
        
        PrintWriter out = res.getWriter();
        out.println("resultado: "+k);
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
        int i = Integer.parseInt(req.getParameter("numero1"));
        int j = Integer.parseInt(req.getParameter("numero1"));
        int k = i + j;
        
        PrintWriter out = res.getWriter();
        out.println("resultado: "+k);
    }
}
