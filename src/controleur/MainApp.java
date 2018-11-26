/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import modele.Reservation;
import modele.gesReservation;

/**
 *
 * @author jules
 */
public class MainApp extends Application
{
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    public MainApp()
    {
    }
    
    
    
    @Override
    public void start(Stage primaryStage) throws ClassNotFoundException, SQLException
    {
        ArrayList<Reservation> lesReservations = gesReservation.getReservations();
        
        for(int i = 0; i< lesReservations.size(); i++)
        {
            System.out.println("coucou");
            System.out.println(lesReservations.get(i).toString());
        }
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Accueil");
        try
          {
              // Chargement du layout racine à partir du fichier fxml file
              FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/vue/FenFXML_NoeudRacine.fxml"));
              rootLayout = (BorderPane) loader.load();
              Scene scene = new Scene(rootLayout);
              primaryStage.setScene(scene);
              primaryStage.show();
          }
          catch (IOException e)
          {
              // Exception qui intervient si le fichier fxml file n'a pas pu être chargé
              e.printStackTrace();
          }
          affichageAccueil();
    }

    public Stage getPrimaryStage()
    {
        return primaryStage;
    }
    
    public void affichageAccueil()
    {
        try
        {
            // Charge le fichier fxml (FenFXML_Coordo) et le place au centre du layout principal
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/vue/FenFXML_Accueil.fxml"));
            AnchorPane overviewPage;
            overviewPage = (AnchorPane) loader.load();
            rootLayout.setCenter(overviewPage);
            
            // Donne accès au MainApp pour le controleur
            FenFXML_AccueilController controller = loader.getController();
            controller.setMainApp(this);
   
        }
        catch (IOException e)
        {
            // Exception qui intervient si le fichier fxml file n'a pas pu être chargé
            e.printStackTrace();
        }
    }
    
    
    //remarque inutile
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
//    @Override
//    public void stop()
//    {
//        
//    }
    
}
