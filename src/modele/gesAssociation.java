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
public class gesAssociation
{
    static Connection conn;
    
    static String pilote = "org.gjt.mm.mysql.Driver";
    static String url = new String("jdbc:mysql://localhost/gesemp");

    //Functions : 
    
    public static ArrayList<Association> getAssociations() throws ClassNotFoundException, SQLException
    {
        
        Statement stmt;
        ResultSet jeuEnr;
        ArrayList<Association> lesAssos = new ArrayList();
        
        conn = DriverManager.getConnection(url,"root","");
        stmt = conn.createStatement();			            
        jeuEnr = stmt.executeQuery("select * from Association");		
        Class.forName(pilote);
        while(jeuEnr.next())
        {
            lesAssos.add(new Association(jeuEnr.getString(0),jeuEnr.getString(1),jeuEnr.getString(2),jeuEnr.getString(3)));
        }
        return lesAssos;
        
    }
    
    public static Association getUneAssociation(String RefAssociaiton) throws ClassNotFoundException, SQLException
    {
        Statement stmt;
        ResultSet jeuEnr;
        Association a = new Association();
        
        conn = DriverManager.getConnection(url,"root","");
        stmt = conn.createStatement();			            
        jeuEnr = stmt.executeQuery("select * from Association where RefAsso = '"+RefAssociaiton+"'");		
        Class.forName(pilote);
        while(jeuEnr.next())
        {
            a = new Association(jeuEnr.getString(0),jeuEnr.getString(1),jeuEnr.getString(2),jeuEnr.getString(3));
        }
        
        return a;
    }
    
    public static boolean existAssociation(String RefAsso) throws ClassNotFoundException, SQLException
    {
        Statement stmt;
        ResultSet jeuEnr;
        int i = 0;
        
        conn = DriverManager.getConnection(url,"root","");
        stmt = conn.createStatement();			            
        jeuEnr = stmt.executeQuery("select count(*) from Association where RefAsso = '"+RefAsso+"'");		
        Class.forName(pilote);
        while(jeuEnr.next())
        {
            i = jeuEnr.getInt(1);
        }
        
        if(i == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
