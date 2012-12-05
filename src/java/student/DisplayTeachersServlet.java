package student;



import business.Student;
import business.Teacher;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.ArrayList;
import data.DB;

public class DisplayTeachersServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        // TODO: get an ArrayList of User objects from the database
        DB database = new DB();
        ArrayList<Teacher> list = database.listTeachers();
        HttpSession session = request.getSession();
        // TODO: set the ArrayList of User objects as a session attribute
        session.setAttribute("teacherList", list);
        
        String url = "/teachers.jsp";
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