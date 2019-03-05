/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        Button btn = new Button();
        
        
        BorderPane pane = new BorderPane();
        Text title = new Text("California");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        title.setFill(Color.GREEN);
        
        Image caPic = new Image("uilayout/Desert-to-sea logo.gif");
        ImageView ivPic = new ImageView(caPic);
        
        pane.setTop(title);
        pane.setCenter(ivPic);
        pane.setBottom(btn);
        
        Scene scene = new Scene(pane, 350, 400);
        
       
        primaryStage.setTitle("California!");
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
