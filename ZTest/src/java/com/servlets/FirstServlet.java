/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
public class FirstServlet implements Servlet{
    //Life cycle method
    ServletConfig confg;
    
    @Override
    public void init(ServletConfig confg){
        this.confg = confg;
        System.out.println("creating Object.....");
    }
    
    @Override
    public void service(ServletRequest req ,ServletResponse res)throws ServletException,IOException{
        System.out.println("Servicing......");
        //set the content type of the response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>this is my output from servlet method:</h1>");
        out.println("<h1>Today's date and time is : "+new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy(){
        System.out.println("going to destroy servlet object");
    }
    
//    Non life cycle method
    
    @Override
    public ServletConfig getServletConfig(){
        return this.confg;
    }
    
    @Override
    public String getServletInfo(){
        return "this serlet is created by Sumit Singh Rajput";
    }
}
