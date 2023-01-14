package com.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static javafx.scene.paint.Color.RED;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage){
        int min = 0;
        int max= 6;

        String [] value={"блатний", "мужик","козел","недоторканний", "петух", "опущений","обіженний"};

        List <String> mast=new ArrayList <>(Arrays.asList(value));

        Text greeting = new Text("Ти хто по масті?");
        Text result = new Text("");
        Button btn = new Button("я");
        Group group = new Group(greeting,result,btn);
        Scene scene = new Scene(group);


        greeting.setLayoutX(250);
        greeting.setLayoutY(100);
        greeting.setStyle("-fx-font: 30 arial;");

        btn.setLayoutX(340);
        btn.setLayoutY(150);
        btn.setScaleX(2);
        btn.setScaleY(2);
        btn.setOnAction(l->{

            int random = (int)Math.floor(Math.random() * (max - min + 1) + min);

            result.setText(mast.get(random));
        });

        result.setLayoutX(300);
        result.setLayoutY(250);
        result.setStyle("-fx-font: 24 arial;");

        stage.setScene(scene);
        stage.setTitle("Хто ти по масті?");
        stage.setMinHeight(500);
        stage.setMinWidth(800);
        stage.setX(600);
        stage.setY(250);
        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}