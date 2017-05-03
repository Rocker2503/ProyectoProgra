/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Canvas;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nicolas
 */
public class MainWindowController extends Application {
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private Button startNode;
    @FXML
    private Button endNode;
    @FXML
    private Button standNode;
    @FXML
    private Button transition;
    
    @FXML
    private Canvas mainCanvas;

 
    private GridPane rootLayout;
    
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainWindowController.class.getResource("MainWindow.fxml"));
            
            rootLayout = (GridPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
        
            primaryStage.setTitle("Main Application");
            primaryStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
