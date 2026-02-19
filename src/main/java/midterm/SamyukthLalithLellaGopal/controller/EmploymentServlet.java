package midterm.SamyukthLalithLellaGopal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import midterm.SamyukthLalithLellaGopal.model.Employment;

/**
 * Controller Servlet: fetches values from the client (index.jsp),
 * creates a Model object, and forwards to success.jsp.
 */
@WebServlet("/submitEmployment")
public class EmploymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmploymentServlet() {
        super();
    }

    // Optional: If someone opens the servlet URL directly, send them to the form page.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    // Handles form submission
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullname = request.getParameter("fullname");
        String contactNumber = request.getParameter("contactNumber");
        String email = request.getParameter("email");
        String dateAvailable = request.getParameter("dateAvailable");
        String salary = request.getParameter("salary");

        Employment emp = new Employment(fullname, contactNumber, email, dateAvailable, salary);

        request.setAttribute("emp", emp);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
