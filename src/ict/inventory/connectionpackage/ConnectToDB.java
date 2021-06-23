/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.inventory.connectionpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danverkanyemba
 */
public class ConnectToDB {
    public final Connection conn;

    public ConnectToDB() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ict_inventory","ict","");


    }
    

   public static void main(String[] args) {

   }
}
