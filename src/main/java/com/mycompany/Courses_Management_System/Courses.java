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


/**
 *
 * @author moham
 */
public class Courses implements DatabaseOperations {
    Arguments ArgClass = new Arguments();
    public  Courses(Arguments Arg){
        ArgClass.Start = Arg.Start;
        ArgClass.Idcourse = Arg.Idcourse;
        ArgClass.End = Arg.End;
        ArgClass.Room = Arg.Room;
        ArgClass.Price = Arg.Price;
        ArgClass.branch = Arg.branch;
        ArgClass.days = Arg.days;
    }
    @Override
    public ResultSet search() {
            try {
            PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.SearchForCourse());
            Prepared_Statement.setString (1,ArgClass.Idcourse);
            ResultSet result = Prepared_Statement.executeQuery();
            
            return result;
              
        } 
        catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            ResultSet result = null;
            return result;

    }
    }

    @Override
    public void Insert() {
        ResultSet result = search();
        try {
            if (!result.next()){
                PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.AddCourse());
                Prepared_Statement.setString (1,ArgClass.Idcourse);
                Prepared_Statement.setString (2,ArgClass.Room);
                Prepared_Statement.setString (3,ArgClass.branch);
                Prepared_Statement.setFloat (4,ArgClass.Price);
                Prepared_Statement.setDate(5,new java.sql.Date(ArgClass.Start.getTime()));
                Prepared_Statement.setDate (6,new java.sql.Date(ArgClass.End.getTime()));
                Prepared_Statement.setInt (7,ArgClass.days);
                ResultSet x = Prepared_Statement.executeQuery();
                ShowDataInGui.ShowTextMessage("Add Sucessfully");
                
            }
            else{
                ShowDataInGui.ShowTextMessage("This Course Already Found");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update() {
        ResultSet result = search();
        try {
            if (result.next()){
                PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.UpdateCourse());
                
                Prepared_Statement.setString (1,ArgClass.Room);
                Prepared_Statement.setString (2,ArgClass.branch);
                Prepared_Statement.setFloat (3,ArgClass.Price);
                Prepared_Statement.setDate(4,new java.sql.Date(ArgClass.Start.getTime()));
                Prepared_Statement.setDate (5,new java.sql.Date(ArgClass.End.getTime()));
                Prepared_Statement.setInt (6,ArgClass.days);
                Prepared_Statement.setString (7,ArgClass.Idcourse);
                ResultSet v = Prepared_Statement.executeQuery();
                ShowDataInGui.ShowTextMessage("Update Sucessfully");
                
            }
            else{
                ShowDataInGui.ShowTextMessage("This Course Not Found");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Delete() {
        ResultSet result = search();
        try {
            if (result.next()){
                PreparedStatement Prepared_Statement = DatabasePraparedQuery.Database_PreparedStatement(SQLQueries.DeleteCourse());
                Prepared_Statement.setString (1,ArgClass.Idcourse);
                ResultSet v = Prepared_Statement.executeQuery();
                ShowDataInGui.ShowTextMessage("DELETE Sucessfully");
                
            }
            else{
                ShowDataInGui.ShowTextMessage("This Course Not Found");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }    }
    
}
