/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import modele.Sport;
import modele.gesSport;

/**
 * FXML Controller class
 *
 * @author jules
 */
public class FenFXML_GestionSportController implements Initializable
{

    @FXML
    private ComboBox dpd_sportASuppr;
    
    @FXML
    private TextField txt_nouvSport;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            ArrayList listeSport = gesSport.getSports();
            ObservableList<String> Options = FXCollections.observableArrayList(listeSport);
            dpd_sportASuppr.setItems(Options);
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(FenFXML_GestionSportController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    @FXML
    private void handleSupprimer()
    {
        
    }
    
    @FXML
    private void handleAjouter()
    {
        
    }
}
