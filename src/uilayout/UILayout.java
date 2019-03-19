/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilayout;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class UILayout extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        setUserAgentStylesheet(STYLESHEET_MODENA);
                ObservableList<PieChart.Data> pieData =
                FXCollections.observableArrayList(
                new PieChart.Data("Rent", 500),
                        new PieChart.Data("Electric",125),
                        new PieChart.Data("Groceries", 235),
                        new PieChart.Data("Entertainment", 200),
                        new PieChart.Data("Cell Phone", 80));
        
        PieChart budget = new PieChart(pieData);
        budget.setTitle("Monthy expenses");
        
        FlowPane root = new FlowPane();
        root.getChildren().add(budget);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Apply CSS!");
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
