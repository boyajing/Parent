package com.nantian.servlet;

import com.nantian.service.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nantian on 2017/8/15.
 */
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        SimpleService service=new SimpleService();
        String str=service.getSimpleService();
        out.print(str);
        out.flush();
        out.close();
    }
}
