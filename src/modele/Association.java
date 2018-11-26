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
public class Association
{
    private String RefAsso;
    private String ville;
    private String Adresse;
    private String NomResponsable;

    public Association()
    {
    }

    public Association(String RefAsso, String ville, String Adresse, String NomResponsable)
    {
        this.RefAsso = RefAsso;
        this.ville = ville;
        this.Adresse = Adresse;
        this.NomResponsable = NomResponsable;
    }

    public String getRefAsso()
    {
        return RefAsso;
    }

    public String getVille()
    {
        return ville;
    }

    public String getAdresse()
    {
        return Adresse;
    }

    public String getNomResponsable()
    {
        return NomResponsable;
    }

    public void setRefAsso(String RefAsso)
    {
        this.RefAsso = RefAsso;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    public void setAdresse(String Adresse)
    {
        this.Adresse = Adresse;
    }

    public void setNomResponsable(String NomResponsable)
    {
        this.NomResponsable = NomResponsable;
    }

    @Override
    public String toString()
    {
        return RefAsso;
    }
    
    
}
