/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Courses_Management_System;

import DataBase.DatabasePraparedQuery;
import DataBase.SQLQueries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author moham
 */
public class Admin {
    private int ID;
    private String Password;
    Arguments ArgClass = new Arguments ();
    public Admin(){
    }
    public Admin (Arguments Arg){
        this.ID = Arg.ID;
        this.Password = Arg.passwordd;
    }
    public ResultSet search(){
      try {
          PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.SearchForAdmin());
          Prepared_Statement.setInt (1,ID);
          ResultSet result = Prepared_Statement.executeQuery();

          return result;

      } catch (SQLException ex) {
          Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);

      }
      return null; 
      }
    public void Check_Validaion (JFrame CurrentFrame) throws SQLException{
        ResultSet Data = search();
        if (Data.next()){
            if (Data.getInt("ID") == this.ID & Data.getString("Password").equals(Password)){
                InterFaces.SwitchTOAdminInterFace(CurrentFrame);
                return ;
            }
        }
        ShowDataInGui.ShowTextMessage("password or Id uncorrect");
        return ;
    }
    public void addcourse(Arguments Arg){
        Courses Course = new Courses(Arg);
        Course.Insert();
    }
    public void Updatecourse(Arguments Arg){
        Courses Course = new Courses(Arg);
        Course.Update();
    }
    public void Deletecourse(Arguments Arg){
        Courses Course = new Courses(Arg);
        Course.Delete();
    }
    public void addStudent(Arguments Arg){
        Student Student = new Student(Arg);
        Student.Insert();
    }
    public void UpdateStudent(Arguments Arg){
        Student Student = new Student(Arg);
        Student.Update();
    }
    public void DeleteStudent(Arguments Arg){
        Student Student = new Student(Arg);
        Student.Delete();
    }
    public void addInst(Arguments Arg){
        Instructor Instructor = new Instructor(Arg);
        Instructor.Insert();
    }
    public void UpdateInst(Arguments Arg){
        Instructor Instructor = new Instructor(Arg);
        Instructor.Update();
    }
    public void DeleteInst(Arguments Arg){
        Instructor Instructor = new Instructor(Arg);
        Instructor.Delete();
    }
    
}
