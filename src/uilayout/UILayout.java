/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
 
        
        BorderPane root = new BorderPane();        
        Scene scene = new Scene(root, 400, 400, Color.WHITE);
        
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);
        
        //File menu - new save print exit
        Menu fileMenu = new Menu();
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("print");
        MenuItem exitMenuItem = new MenuItem("Exit");
        
        //add the new menuitems to the filemenu
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, printMenuItem, new SeparatorMenuItem(), exitMenuItem);
        
        Menu languageMenu = new Menu("Language");
        CheckMenuItem javaMenuItem = new CheckMenuItem("Java");
        CheckMenuItem pythonMenuItem = new CheckMenuItem("Python");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
                languageMenu.getItems().addAll(javaMenuItem, pythonMenuItem, htmlMenuItem);
        
        MenuItem FXMenuItem = new MenuItem("JavaFX");
                languageMenu.getItems().addAll(new SeparatorMenuItem(),FXMenuItem);
        
        Menu tutorialMenu = new Menu("Tutorial");
        tutorialMenu.getItems().addAll(
            new MenuItem("Buttons"),
            new MenuItem("Menus"),
            new MenuItem("Images"));
        
        
        primaryStage.setTitle("Menu!");
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
