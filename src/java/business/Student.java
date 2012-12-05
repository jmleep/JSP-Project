/**
 * Student.java
 * @author Jordan Leeper
 * @version 1.0
 * 
 */
package business;
import java.io.Serializable;

public class Student implements Serializable
{
  private int studentID;
  private String firstName;
  private String lastName;
  private String phone;
  private double balance;
  private String enrollDate;  

  public Student(int sid, String fn, String ln, String p, double b, String d )
  {
    studentID = sid;
    firstName = fn;
    lastName = ln;
    phone = p;
    balance = b;
    enrollDate = d;
  }

  public Student()
  {
      studentID = 0;
      firstName="";
      lastName ="";
      phone = "";
      balance = 0.0;
      enrollDate= "";
              
  }
  
/**
 * @return the id of a student
 */
  public int getStudentID()
  {
    return studentID;
  }
  
  /**
   * @return the first name of a student
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * @return the last name of a student.
   */
  public String getLastName()
  {
    return lastName;
  }
/**
 * @return the phone number of a student.
 */
  public String getPhone()
  {
    return phone;
  }

  
  /**
   * @return the student's account balance.
   */
  public double getBalance()
  {
    return balance;
  }

  /**
   * @return the enrollment date of the student.
   */
  public String getEnrollDate()
  {
    return enrollDate;
  }

  /**
   * @return all information concerning the student as a string.
   */
  public String toString()
  {
    return studentID + ", " + firstName + ", " + lastName + ", " + phone + " " +
      balance + " " + enrollDate;
  }
}