package DataBase;

import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public interface DatabaseOperations {
    public ResultSet search();
    public void Insert();
    public void Update();
    public void Delete();
}
