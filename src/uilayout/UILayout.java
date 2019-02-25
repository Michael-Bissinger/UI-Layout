/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilayout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Create the UI controls
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Label lbl = new Label("I'm a label");
        TextField tf = new TextField("Enter text here");
        Hyperlink hl = new Hyperlink("I'm a hyperlink");
        RadioButton rb = new RadioButton("RadioButton");
        rb.setStyle("-fx-base: #61a2b1");
        CheckBox cb = new CheckBox();
        
        PasswordField pw = new PasswordField();
        
        
        //Needed for Helbling File Renamer
        //FileChooser fc = new Filechooser();
        //fc.setTitle("Pick your file");
        //fc.showOpenDialog(primaryStage);
        
        
        //Pick Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(50);
        grid.setPadding(new Insets(25,25,25,25));
        
        //add controls to Grid
        grid.add(btn,0,0);
        grid.add(lbl,1,0);
        grid.add(tf,2,0);
        grid.add(rb,0,1);
        grid.add(cb,1,1);
        
        grid.add(pw,3,0);
        
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        

        
        //root.getChildren().add(cir);
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("User controls!");
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
