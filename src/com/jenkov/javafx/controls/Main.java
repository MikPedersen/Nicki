package com.jenkov.javafx.controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");

        FileInputStream input = new FileInputStream("C:\\Users\\mikpe\\OneDrive\\Skrivebord\\nicki.jpg");
        FileInputStream input2 = new FileInputStream("C:\\Users\\mikpe\\OneDrive\\Skrivebord\\bodybuilder.jpg");
        Image image = new Image(input);
        Image image2 = new Image(input2);
        ImageView imageView = new ImageView(image);
        Button button = new Button("Danmarks flotteste fyr!" + "\nClick to undress", imageView);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Button button = (Button) e.getSource();
                button.setGraphic(new ImageView(image2));
            }
        });

        Scene scene = new Scene(button, 800, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}