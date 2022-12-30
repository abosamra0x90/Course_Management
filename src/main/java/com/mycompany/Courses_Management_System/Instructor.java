/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Courses_Management_System;

import DataBase.DatabaseOperations;
import DataBase.DatabasePraparedQuery;
import DataBase.SQLQueries;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author moham
 */
public class Instructor implements DatabaseOperations {
    private String password,Newpassword,IDCourse,username;
    private int ID;
    public  Instructor (Arguments Arg){
    this.ID = Arg.ID ;
    this.password = Arg.passwordd;
    this.IDCourse = Arg.Idcourse;
    this.username = Arg.username;
    }
    public  Instructor (){
    
    }
    @Override
    public ResultSet search() {
        try {
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.SearchForInstructorQuery());
            Prepared_Statement.setInt (1,ID);
            ResultSet result = Prepared_Statement.executeQuery();
            
            return result;
              
        } 
        catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            ResultSet result = null;
            return result;

    }
    
    }
    public void Check_Validaion(JFrame CurrentFrame) throws SQLException{
        ResultSet Data = search();
        if (Data.next()){
            if (Data.getInt("ID") == this.ID & Data.getString("Password").equals(password)){
                InterFaces.SwitchTOAdminInterFace(CurrentFrame);
                return ;
            }
        }
        ShowDataInGui.ShowTextMessage("password or Id uncorrect");
        return ;
    }

    @Override
    public void Insert() {
         try {
            ResultSet result = search();
            if (!result.next()){
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.InsertInstructor());
            Prepared_Statement.setInt(1, ID);
            Prepared_Statement.setString(2, password);
            Prepared_Statement.setString(3, IDCourse);
            Prepared_Statement.setString(4, username);
            ResultSet Result = Prepared_Statement.executeQuery();
            ShowDataInGui.ShowTextMessage("Done");
            }
            else {
                 ShowDataInGui.ShowTextMessage("This Instructor Already Found");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update() {
       try 
         {  ResultSet result = search();
         if (result.next()){
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.Updateinstructor());
            Prepared_Statement.setString(1, Newpassword);
            Prepared_Statement.setInt(2, ID);
            ResultSet Result = Prepared_Statement.executeQuery();
            JOptionPane.showMessageDialog(null , "Update Sucessfully");
         }
         else {ShowDataInGui.ShowTextMessage("this Instructor Not Found");}
        } 
         catch (SQLException ex) 
        {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Delete() {
             try 
         {  ResultSet result = search();
         if (result.next()){
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.DeleteInstructor());
            Prepared_Statement.setInt(1, ID);
            ResultSet Result = Prepared_Statement.executeQuery();
            JOptionPane.showMessageDialog(null , "Delete Done");
         }
         else {ShowDataInGui.ShowTextMessage("this Student Not Found");}
        } 
         catch (SQLException ex) 
        {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet GetDataFromDataBase() {
        try {
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.SearchForAllInstructorQuery());
            ResultSet result = Prepared_Statement.executeQuery();
            
            return result;
              
        } 
        catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            ResultSet result = null;
            return result;

    }}
    public void Show_All_Instructor(JTable jtable){
        ResultSet Resulte = GetDataFromDataBase();
        ShowDataInGui ShowInstructor = new ShowDataInGui();
        try {
            ShowInstructor.ShowSuppliers(Resulte, jtable);
        } catch (SQLException ex) {
            Logger.getLogger(Instructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
