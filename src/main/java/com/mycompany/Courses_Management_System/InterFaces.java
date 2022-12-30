/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Courses_Management_System;
import gui.AdminGui;
import gui.EditCourses;
import gui.EditInstructor;
import gui.LoginGui;
import gui.EditStudent;
import gui.ShowInstructorsGui;
import gui.ShowStudentsGui;
import gui.UpdateUser;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author moham
 */
public class InterFaces {
    public static void SwitchTOAdminInterFace (JFrame CurrentFrame){  
    AdminGui pointer_to_AdminInterface = new AdminGui();
    SwichProcess Switch = new SwichProcess(pointer_to_AdminInterface,CurrentFrame);
    }
    
    public static void SwitchTOLoginInterface (JFrame CurrentFrame){  
    LoginGui pointer_to_LoginInterface = new LoginGui();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
     public static void SwitchTOCourseInterface (JFrame CurrentFrame){  
    EditCourses pointer_to_LoginInterface = new EditCourses();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
     public static void SwitchTOUpdateUserInterface (JFrame CurrentFrame){  
    UpdateUser pointer_to_LoginInterface = new UpdateUser();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
      public static void SwitchTOEditStudentInterface (JFrame CurrentFrame){  
    EditStudent pointer_to_LoginInterface = new EditStudent();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
      public static void SwitchTOEditInstInterface (JFrame CurrentFrame){  
    EditInstructor pointer_to_LoginInterface = new EditInstructor();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
      public static void SwitchTOAllInstInterface (JFrame CurrentFrame){  
    ShowInstructorsGui pointer_to_LoginInterface = new ShowInstructorsGui();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }
     public static void SwitchTOAllStudentInterface (JFrame CurrentFrame){  
    ShowStudentsGui pointer_to_LoginInterface = new ShowStudentsGui();
    SwichProcess Switch = new SwichProcess(pointer_to_LoginInterface,CurrentFrame);
    }  
   
}
