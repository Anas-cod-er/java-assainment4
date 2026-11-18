package com.example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ShowTimesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String COUNTER_ATTRIBUTE = "visitCount";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer times = (Integer) context.getAttribute(COUNTER_ATTRIBUTE);

        synchronized (context) {
            times = (Integer) context.getAttribute(COUNTER_ATTRIBUTE);
            if (times == null) {
                times = 0;
            }
            times++;
            context.setAttribute(COUNTER_ATTRIBUTE, times);
        }

        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("Visit Count：" + times);
        response.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
