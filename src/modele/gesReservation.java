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
import static modele.gesSport.conn;

/**
 *
 * @author jules
 */
public class gesReservation
{
    static Connection conn;
    
    static String pilote = "org.gjt.mm.mysql.Driver";
    static String url = new String("jdbc:mysql://localhost/001_gymnase");
    
    public static ArrayList<Reservation> getReservations() throws ClassNotFoundException, SQLException
    {
        Statement stmt;
        ResultSet jeuEnr;
        ArrayList<Reservation> lesReservations = new ArrayList();
        
        
        
        Class.forName(pilote);
        conn = DriverManager.getConnection(url,"root","");
        stmt = conn.createStatement();			            
        jeuEnr = stmt.executeQuery("SELECT * FROM reservation");		
        
        while(jeuEnr.next())
        {
            Salle uneSalle = new Salle();
            Association uneAssociation = new Association();
            
            // jeuEnr.getString(1) => refSalle
            // jeuEnr.getString(4) => refAsso
            lesReservations.add(new Reservation(uneSalle,jeuEnr.getString(2),jeuEnr.getString(3),uneAssociation));
        }
       return lesReservations;
    }
}
