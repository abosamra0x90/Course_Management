/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Courses_Management_System;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;



/**
 *
 * @author moham
 */
public class ShowDataInGui {
   
    public static void ShowTextMessage(String Message){
    JOptionPane.showMessageDialog(null , Message);
    }
    
   public void ShowSuppliers(ResultSet resultSet,JTable jtaple) throws SQLException{ 
        
        System.out.println(resultSet.next());
        System.out.println(resultSet.getInt("ID"));
        Arguments ArgumentForAll= new Arguments ();
        while(resultSet.next())
    {   
           ArgumentForAll.ID = resultSet.getInt("UserName");
           ArgumentForAll.Idcourse = resultSet.getString("Course");
           String tbData[]={Integer.toString(ArgumentForAll.ID ),ArgumentForAll.Idcourse};
           DataInJTable.PutFrom_DataTo_Jtable(jtaple, tbData);
         }
}
    public void ShowStudents(ResultSet resultSet,JTable jtaple) throws SQLException{ 
        Arguments ArgumentForAll= new Arguments ();
        while(resultSet.next())
    {   
           ArgumentForAll.ID = resultSet.getInt("ID");
           ArgumentForAll.username = resultSet.getString("Username");
           String tbData[]={Integer.toString(ArgumentForAll.ID ),ArgumentForAll.Idcourse};
           DataInJTable.PutFrom_DataTo_Jtable(jtaple, tbData);
         }
}
}

    

