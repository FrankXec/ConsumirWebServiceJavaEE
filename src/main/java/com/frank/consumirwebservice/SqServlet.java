
package com.frank.consumirwebservice;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SqServlet extends HttpServlet{ 
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
        //servlet utilizada por el otro servlet
        //int k =(int) req.getParameter("k");//otenemos un parametro de la URL
        /*
        HttpSession session = req.getSession();
        var x = session.getAttribute("name")//obtenes el atributo almacenado en el server principal
        */
        /*
        Cookie cookie[] = req.getCookies(); //tenemos todas las kookies en un array
        en for -> item.getName().equeals("x") -> c.getValue();
        */
    }
    
}
