package com.example.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Grid extends Application {



    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn1 = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        GridPane gridPane = new GridPane();
        TextField texto1 = new TextField();
        TextField texto2 = new TextField();
        Label eti1 = new Label();
        Label eti2 = new Label();
        eti1.setText("Nombre");
        eti2.setText("Edad");
        Button btn2 = new Button();
        btn1.setText("Aceptar");
        btn2.setText("Cancelar");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(eti1, 0, 0);
        gridPane.add(texto1, 1, 0);
        gridPane.add(eti2, 0, 1);
        gridPane.add(texto2, 1, 1);
        gridPane.add(btn1, 0, 2);
        gridPane.add(btn2, 1, 2);
        Scene scene = new Scene(gridPane);
        gridPane.setMargin(btn1, new Insets(0, 0, 0, 40));
        gridPane.setMargin(btn2, new Insets(0, 0, 0, 40));
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
