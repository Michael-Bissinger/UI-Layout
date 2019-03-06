/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Rotate rotate = new Rotate();
        Button btnRotate = new Button("Click to Rotate");
        btnRotate.getTransforms().add(rotate);
        
        
        Scene scene = new Scene(root, 350, 400);
        
       
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
