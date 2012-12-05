package student;



import business.Student;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.ArrayList;
import data.DB;

public class DisplayUsersServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        // TODO: get an ArrayList of User objects from the database
        DB database = new DB();
        ArrayList<Student> list = database.listStudents();
        HttpSession session = request.getSession();
        // TODO: set the ArrayList of User objects as a session attribute
        session.setAttribute("studentList", list);
        
        String url = "/users.jsp";
        RequestDispatcher dispatcher =
              getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        doGet(request, response);
    }    
}