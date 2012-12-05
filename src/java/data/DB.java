package data;
import business.Student;
import business.Teacher;
import java.sql.*;
import java.util.ArrayList;
public class DB {
	private Connection connect = null;
	private String dbURL = "jdbc:mysql://157.62.23.146/leeperj28";
	private String studentname = "leeperj28";
	private String password = "leeperj28";

	public DB() {
		getConnection();
	}

	private void getConnection() {
		try {
		connect = DriverManager.getConnection(dbURL, studentname, password);
		}
		catch (SQLException e) {
		System.out.println("Exception thrown calling getConnection.\n" + e.getMessage());
		}
	}
	
	public ArrayList<Student> listStudents() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String q = "SELECT * FROM STUDENT";
			ps = connect.prepareStatement(q);
			rs = ps.executeQuery();
			while(rs.next()) {
				studentList.add(new Student(rs.getInt("STU_ID"), rs.getString("STU_FNAME"), 
					rs.getString("STU_LNAME"), rs.getString("STU_PHONE"), rs.getDouble("STU_BALANCE"), rs.getString("STU_ENROLLDATE")));
			}
			rs.close();
			ps.close();
		}
		catch(SQLException se) {
			System.out.println("SQLException: " + se.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
		return studentList;
	}
        public ArrayList<Teacher> listTeachers() {
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String q = "SELECT * FROM TEACHER";
			ps = connect.prepareStatement(q);
			rs = ps.executeQuery();
			while(rs.next()) {
				teacherList.add(new Teacher(rs.getInt("TEACH_ID"), rs.getString("TEACH_FNAME"), 
					rs.getString("TEACH_LNAME"), rs.getString("TEACH_PHONE")));
			}
			rs.close();
			ps.close();
		}
		catch(SQLException se) {
			System.out.println("SQLException: " + se.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
		return teacherList;
	}
        
}
