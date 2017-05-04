/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
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
    
    private boolean isStartNode = false;
    private boolean isEndNode = false;
    private boolean isStandNode = false;
    private boolean isTransition = false;
    
    private BufferedImage img;
    
    
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
            try{
            img = ImageIO.read(new File("src/imagenes/dc6.jpg"));            
            }
            catch(IOException e)
            {
            }
            
            rootLayout.setOnMouseClicked(new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent event) {
                System.out.println("apretaaa!!!!!!!!!!");
                System.out.println("isHANDLE: " + isIsStartNode());
//                System.out.println("getCursor: " + getStartNode().getCursor().toString());
                if(isIsStandNode())
                {
                    //agregar nodo inicial, desactivar booleano y boton
                    System.out.println("apretaaa1");
                }
                else if(isEndNode)
                {
                    //agregar nodo, desactivar booleano
                    System.out.println("apreta222");
                }
                else if(isStandNode)
                {
                    //agregar nodo, desactivar booleano
                }
                else if(isTransition){

                }
            }
        });
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
            System.out.println("is: " + this.isStartNode);
            System.out.println("holi1");
            this.setIsStartNode(true);
            System.out.println("is: " + this.isStartNode);
            startNode.setCursor(Cursor.WAIT);
        }
        
        if(event.getSource() == this.endNode)
        {
            System.out.println("holi2");
            this.isEndNode = true;
        }
        
        if(event.getSource() == this.standNode)
        {
            System.out.println("holi3");
            this.isStandNode = true;
        }
        
        if(event.getSource() == this.transition)
        {
            this.isTransition = true;
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

    /*@Override
    public void mouseClicked(MouseEvent e) {
        
        if(isStartNode)
        {
            //agregar nodo inicial, desactivar booleano y boton
            System.out.println("apretaaa1");
        }
        else if(isEndNode)
        {
            //agregar nodo, desactivar booleano
            System.out.println("apreta222");
        }
        else if(isStandNode)
        {
            //agregar nodo, desactivar booleano
        }
        else if(isTransition){
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public boolean isIsStartNode() {
        return isStartNode;
    }

    public void setIsStartNode(boolean isStartNode) {
        this.isStartNode = isStartNode;
    }

    public boolean isIsEndNode() {
        return isEndNode;
    }

    public void setIsEndNode(boolean isEndNode) {
        this.isEndNode = isEndNode;
    }

    public boolean isIsStandNode() {
        return isStandNode;
    }

    public void setIsStandNode(boolean isStandNode) {
        this.isStandNode = isStandNode;
    }

    public boolean isIsTransition() {
        return isTransition;
    }

    public void setIsTransition(boolean isTransition) {
        this.isTransition = isTransition;
    }

    public Button getStartNode() {
        return startNode;
    }

    public void setStartNode(Button startNode) {
        this.startNode = startNode;
    }

    public Button getEndNode() {
        return endNode;
    }

    public void setEndNode(Button endNode) {
        this.endNode = endNode;
    }

    public Button getStandNode() {
        return standNode;
    }

    public void setStandNode(Button standNode) {
        this.standNode = standNode;
    }

    public Button getTransition() {
        return transition;
    }

    public void setTransition(Button transition) {
        this.transition = transition;
    }
    
        
    
    
    
}
