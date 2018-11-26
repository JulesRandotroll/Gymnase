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
public class Salle
{
    private String RefSalle;
    private int Surface;
    private String typeRevetement;

    
    
    public Salle()
    {
    }
    
    public Salle(String RefSalle, int Surface, String typeRevetement)
    {
        this.RefSalle = RefSalle;
        this.Surface = Surface;
        this.typeRevetement = typeRevetement;
    }

    public String getRefSalle()
    {
        return RefSalle;
    }

    public int getSurface()
    {
        return Surface;
    }

    public String getTypeRevetement()
    {
        return typeRevetement;
    }

    public void setRefSalle(String RefSalle)
    {
        this.RefSalle = RefSalle;
    }

    public void setSurface(int Surface)
    {
        this.Surface = Surface;
    }

    public void setTypeRevetement(String typeRevetement)
    {
        this.typeRevetement = typeRevetement;
    }
    
    @Override
    public String toString()
    {
        return RefSalle;
    }
}
