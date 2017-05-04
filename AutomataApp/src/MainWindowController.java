/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class APLICACION
 *
 * @author Nicolas
 */
public class MainWindowController extends Application{
    
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
//            this.startNode.setOnAction(this::handleButtonAction);
//            this.startNode.setOnAction((e) -> handleBottonAction(e));
            /*this.startNode.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                
                System.out.println("holi");
            }
        });*/
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    public void handleButtonAction(ActionEvent event) 
    {
        if(event.getSource() == this.startNode)
        {
            System.out.println("holi1");
        }
        
        if(event.getSource() == this.endNode)
        {
            System.out.println("holi2");
        }
        
        if(event.getSource() == this.standNode)
        {
            System.out.println("holi3");
        }
        
        if(event.getSource() == this.transition)
        {
            
        }
    }
    /*@Override
    public void handle(ActionEvent event) {
    }*/
    
    /*@FXML
    public void initialize() {
        this.startNode.setOnAction(this::handleButtonAction);
        this.standNode.setOnAction(this::handleButtonAction);
    }*/
    
        
    
    
    
}
