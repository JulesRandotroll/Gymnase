/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author jules
 */
public class FenFXML_AccueilController implements Initializable
{
    private MainApp mainApp;

    /**
   * Cette méthode est appelée par l'application principale pour donner
   * une référence sur elle même.
   * @param mainApp
   */
  public void setMainApp(MainApp mainApp)
  {
    this.mainApp = mainApp;
  }
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        
    }    
    
    public void handleQuitter() throws Exception
    {
        mainApp.stop();
    }
    
}
