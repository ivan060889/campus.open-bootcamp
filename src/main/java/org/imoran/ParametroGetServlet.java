package org.imoran;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("parametro/url-get")
public class ParametroGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        out.println("<!DOCTYPE ParametroGetServlet>");
        out.println("<html");
        out.println("    <head>");
        out.println("    <meta charset=\"UTF-8\"");
        out.println("    <title>ParametroGetServlet</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>ParametroGetServlet</h1>");
        out.println("     </body>");
        out.println("</html>");
        out.close();
    }
}
