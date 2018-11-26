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
public class Employe
{
    private String RefEmploye;
    private String Nom;
    private String prenom;
    private String sexe;
    private String adrtesse;
    private String cp;
    private String ville;
    private String tel;

    public Employe(String RefEmploye, String Nom, String prenom, String sexe, String adrtesse, String cp, String ville, String tel)
    {
        this.RefEmploye = RefEmploye;
        this.Nom = Nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adrtesse = adrtesse;
        this.cp = cp;
        this.ville = ville;
        this.tel = tel;
    }

    public String getRefEmploye()
    {
        return RefEmploye;
    }

    public String getNom()
    {
        return Nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public String getSexe()
    {
        return sexe;
    }

    public String getAdrtesse()
    {
        return adrtesse;
    }

    public String getCp()
    {
        return cp;
    }

    public String getVille()
    {
        return ville;
    }

    public String getTel()
    {
        return tel;
    }

    public void setRefEmploye(String RefEmploye)
    {
        this.RefEmploye = RefEmploye;
    }

    public void setNom(String Nom)
    {
        this.Nom = Nom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    public void setAdrtesse(String adrtesse)
    {
        this.adrtesse = adrtesse;
    }

    public void setCp(String cp)
    {
        this.cp = cp;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    @Override
    public String toString()
    {
        return RefEmploye + " : " + Nom + " " + prenom;
    }

    

}
