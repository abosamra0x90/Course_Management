/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Courses_Management_System;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author moham
 */
public class Login {
    private String Password ;
    private  int Type,ID;

    
    public  int Check_Type (int ID){
        if (ID>=1&ID<10) {
            this.Type = 1;
            
        }
        else if (ID >10000){
            this.Type = 2;
            
        }
        else if (ID <10000 &&ID>10){
            this.Type = 3;
            
        }
        else {
            this.Type = 4;
            
            
        }
        return this.Type;
    
    }
    public void Check_Valdiaion (int Type,Arguments Arg,JFrame CurrentFrame) throws SQLException{
        if (Type == 1){
            Admin Check = new Admin (Arg);
            Check.Check_Validaion(CurrentFrame);
        }
        else if (Type == 2){
            Student Check = new Student(Arg);
            Check.Check_Validaion(CurrentFrame);
        }
        else if (Type == 3){
            Instructor Check = new Instructor(Arg);
            Check.Check_Validaion(CurrentFrame);
        }
        else {
            
        }
    }

   
    
}
