/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
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
    
//    @FXML
    private Canvas mainCanvas;

//    @FXML
    private GridPane rootLayout;
    
    private GraphicsContext gc;
    private boolean isStartNode = false;
    private boolean isEndNode = false;
    private boolean isStandNode = false;
    private boolean isTransition = false;
    
    private Image img;
    
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
            //agregando a la mala
            mainCanvas = new Canvas(981, 435);
//            mainCanvas.setWidth(981);
//            mainCanvas.setWidth(435);
            this.gc = mainCanvas.getGraphicsContext2D();
            img = new Image("dc6.jpg");   
            
            /*mainCanvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("Clickea eventt");
                    gc.drawImage(img, event.getX(), event.getY());
                }
            });*/
//            gc.drawImage(img, 20, 270);
            
            rootLayout.getChildren().add(0, mainCanvas);
            primaryStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void click(MouseEvent e)
    {
//        GraphicsContext gc1 = mainCanvas.getGraphicsContext2D();
        if(isIsStartNode())
        {
            //agregar nodo inicial, desactivar booleano y boton
            //LUEGO VER MOIDIFICACIONES PARA VOLVER A ACTIVARLO
            System.out.println("apretaaa1");
            double x = e.getX();
            double y = e.getY();
            System.out.println("x: " + x + " y: "+ y);
            /*ImageView iv1 = new ImageView();
            iv1.setImage(img);
            iv1.setX(x);
            iv1.setY(y);
            iv1.setFitWidth(100);
            iv1.setPreserveRatio(true);
            iv1.setSmooth(true);*/
            draw(img, x, y);
//            GraphicsContext gc1 = metodo();
//            gc1.drawImage(img, x, y);
//            getGc().drawImage(img, x, y);
            
            setIsStartNode(false);
//            getStartNode().setDisable(true);
        }
        else if(isIsEndNode())
        {
            //agregar nodo, desactivar booleano
            System.out.println("apreta222");
            setIsEndNode(false);
        }
        else if(isIsStandNode())
        {
            //agregar nodo, desactivar booleano
            System.out.println("apreta33");
            setIsStandNode(false);
        }
        else if(isIsTransition()){
            
        }
    }
    @FXML
    public void handleButtonAction(ActionEvent event) 
    {
        if(event.getSource() == this.startNode)
        {
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
    void initialize() {
      this.gc = mainCanvas.getGraphicsContext2D();
          rootLayout.getChildren().add(mainCanvas);
    }*/
    
//    @FXML
    public void draw(Image image, double x, double y) {
        System.out.println("sibuja!");
        getGc().drawImage(img, x, y);
    }

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

    public GridPane getRootLayout() {
        return rootLayout;
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

    public GraphicsContext getGc() {
        return gc;
    }
    
}
