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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
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
        VBox cajaVertical = new VBox();
        cajaVertical.setAlignment(Pos.CENTER);

        HBox cajaHorizontal1 = new HBox();
        HBox cajaHorizontal2 = new HBox();
        HBox cajaHorizontal3 = new HBox();
        cajaHorizontal1.setAlignment(Pos.CENTER);
        cajaHorizontal1.setPadding(new Insets(15, 12, 15, 12));
        cajaHorizontal2.setAlignment(Pos.CENTER);
        cajaHorizontal2.setPadding(new Insets(15, 12, 15, 12));
        cajaHorizontal3.setAlignment(Pos.CENTER);
        cajaHorizontal3.setPadding(new Insets(15, 12, 15, 12));


        cajaHorizontal1.setSpacing(10);
        cajaHorizontal2.setSpacing(26);
        cajaHorizontal3.setSpacing(26);
        TextField texto1 = new TextField();
        TextField texto2 = new TextField();
        Label eti1 = new Label();
        Label eti2 = new Label();


        eti1.setText("Nombre");
        eti2.setText("Edad");
        Button btn2 = new Button();
        btn1.setText("Aceptar");
        btn2.setText("Cancelar");



        cajaVertical.getChildren().addAll(cajaHorizontal1,cajaHorizontal2,cajaHorizontal3);
        cajaHorizontal1.getChildren().addAll(eti1,texto1);
        cajaHorizontal2.getChildren().addAll(eti2,texto2);
        cajaHorizontal3.getChildren().addAll(btn1,btn2);
        Scene scene = new Scene(cajaVertical, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }}
