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
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
 
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setHgap(10);
        root.setVgap(10);
        
        //Add title to the page
        Text title = new Text("Leave a Comment!");
        title.setFill(Paint.valueOf("red"));
        
        //UI controls
        Label name = new Label("Enter your name: ");
        TextField userName = new TextField();
        HBox hb = new HBox();
        hb.getChildren().addAll(name, userName);
        //hb.getSpacing(25);
        
        //add Label and  Textfield
        Label lblComment = new Label("Enter your comment: ");
        TextField comment = new TextField();
        
        
        //add Submit and clear Button
        Button submit = new Button("Submit");
        Button clear = new Button("Clear!");
        
        
        // Event Handler DropShadow for submit and clear
        DropShadow shadow = new DropShadow();
        
        submit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
        submit.setEffect(shadow);
        System.out.println("Mouse hovered over the button!");
        });
        
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
        clear.setEffect(shadow);
        System.out.println("Mouse hovered over the button!");
        });
        
        submit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{
            submit.setEffect(null);
            System.out.println("Mouse gone!");
        });
        
        
        clear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{
            clear.setEffect(null);
            System.out.println("Mouse gone!");
        });

        Label lblResponse = new Label();
        
        submit.setOnAction((ActionEvent e)->{
        
        if(comment.getText()!=null && !comment.getText().isEmpty())   //Did the user even enter a text?
        {
            lblResponse.setText(name.getText() + " " + "Thanks for your comment");
        }
        else
        {
            lblResponse.setText("You have not entered a comment!");
        }
    }
        
        

        
        root.add(title, 0, 0, 2, 1);
        root.add(hb, 0, 1);
        root.add(lblComment, 0, 2);
        root.add(comment,0,3);
        root.add(submit,0,4);
        root.add(clear,1,3);
        root.add(lblResponse,0,6,2,1);
        
        //
        
        

        
        //root.getChildren().add(cir);
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 500, 400);
        scene.getStylesheets().add("uilayout/controlStyles.css");
        
        primaryStage.setTitle("UI control event handler!");
        primaryStage.setScene(scene);
        primaryStage.show();

        
        submit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
