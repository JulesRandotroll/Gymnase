/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author jules
 */
public class Reservation
{
    private Salle salle;
    private String date;
    private String heure;
    private Association Asso;

    public Reservation(Salle salle, String date, String heure, Association Asso)
    {
        this.salle = salle;
        this.date = date;
        this.heure = heure;
        this.Asso = Asso;
    }

    public Reservation()
    {
    }

    public Salle getSalle()
    {
        return salle;
    }

    public String getDate()
    {
        return date;
    }

    public String getHeure()
    {
        return heure;
    }

    public Association getAsso()
    {
        return Asso;
    }

    public void setSalle(Salle salle)
    {
        this.salle = salle;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setHeure(String heure)
    {
        this.heure = heure;
    }

    public void setAsso(Association Asso)
    {
        this.Asso = Asso;
    }

    @Override
    public String toString()
    {
        return "Reservation{" + "salle=" + salle.toString() + ", date=" + date + ", heure=" + heure + ", Asso=" + Asso.toString() + '}';
    }
   
    
    
}
