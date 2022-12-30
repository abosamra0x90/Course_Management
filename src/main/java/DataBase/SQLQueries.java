package DataBase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class SQLQueries {
    private static String InsertAdmin = "insert into AdminTable(ID,Password) VALUES(?,?)" ;
    private static String InsertCourse = "insert into Course(ID,Room,Branch,Price,start_date,end_date,days_of_course)"+ "values(?,?,?,?,?,?,?)";
    private static String InsertStudent = "INSERT INTO [dbo].[Student]([ID],[Password],[UserName])VALUES(?,?,?)";
    private static String InsertInstructor = "INSERT INTO [dbo].[Instructor]([ID],[Password],[Course],[UserName])VALUES(?,?,?,?)";
    private static String UpdateQuery = "update Product set Product_Name=?,Product_Expiration=?,Product_Production=?,Product_Quantity=?,Product_Price=?,No_Gain_Price=? where Product_ID=?";
    private static String UpdateCourse = "update Coursess set Room=?,Branch=?,Price=?,start_date=?,end_date=?,days_of_course=? where ID=?";
    private static String AddCourse = "INSERT INTO Coursess([ID],[Room],[Branch],[Price],[start_date],[end_date],[days_of_course])VALUES(?,?,?,?,?,?,?)";
    private static String UpdateusersQuery = "update Student set Password=? where ID=? AND Password=?";
    private static String DeleteCourse = "Delete from Coursess where ID=?";
    private static String CategoryQuery = "select * from Category";
    private static String SearchForInstructorQuery = "Select * from Instructor where ID =? " ;
    private static String SearchForAllInstructorQuery = "Select * from Instructor  " ;
    private static String SearchForAllStudentsQuery = "Select * from Student  " ;
    private static String UpdateStudent = "update Student set Password=? where ID =?" ;
    private static String DeleteInstructor = "Delete from Instructor where ID=?";
    private static String Updateinstructor = "update Instructor set Password=? ,UserName=? where ID =?" ;
    private static String SearchForAdmin = "Select * from Admin where ID=?";
    private static String SearchForCourse = "Select * from Coursess where ID=?";
    private static String SearchForStudent = "Select * from Student where ID=?";
    private static String DeleteStudent = "Delete from Student where ID=?";
    public static String getCategoryQuery() {
        return CategoryQuery;
    }

    public static String DeleteCourse() {
        return DeleteCourse;
    }
    public static String InsertAdmin() {
        return InsertAdmin;
    }

  

    public static String getUpdateQuery() {
        return UpdateQuery;
    }
    public static String SearchForInstructorQuery() {
        return SearchForInstructorQuery;
    }
    public static String SearchForAllStudentsQuery() {
        return SearchForAllStudentsQuery;
    }
    public static String SearchForAllInstructorQuery() {
        return SearchForAllInstructorQuery;
    }
    public static String InsertStudent() {
        return InsertStudent;
    }
    public static String DeleteInstructor() {
        return DeleteInstructor;
    }
    public static String UpdateStudent() {
        return UpdateStudent;
    }
    public static String Updateinstructor() {
        return Updateinstructor;
    }
    public static String InsertInstructor() {
        return InsertInstructor;
    }
    public static String SearchForAdmin() {
        return SearchForAdmin;
    }
    public static String SearchForStudent() {
        return SearchForStudent;
    }
    public static String DeleteStudent() {
        return DeleteStudent;
    }
     public static String AddCourse() {
        return AddCourse;
    }
     public static String UpdateCourse() {
        return UpdateCourse;
    }
      public static String SearchForCourse() {
        return SearchForCourse;
    }
}
