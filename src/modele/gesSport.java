/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jules
 */
public class gesSport
{
    static Connection conn;
    
    static String pilote = "org.gjt.mm.mysql.Driver";
    static String url = new String("jdbc:mysql://localhost/001_gymnase");

    public static ArrayList<Sport> getSports() throws ClassNotFoundException, SQLException
    {
        
        Statement stmt;
        ResultSet jeuEnr;
        ArrayList<Sport> lesSports = new ArrayList();
        
        conn = DriverManager.getConnection(url,"root","");
        stmt = conn.createStatement();			            
        jeuEnr = stmt.executeQuery("select * from Sport");		
        Class.forName(pilote);
        while(jeuEnr.next())
        {
            lesSports.add(new Sport(jeuEnr.getString(0)));
        }
        return lesSports;
        
    }
}
