package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group=new Group();
        Scene scene=new Scene(group,900,400);

        Parent content= FXMLLoader.load(getClass().getResource("myscene.fxml"));
        BorderPane root=new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);
        primaryStage.setTitle("Scene Builder");
        primaryStage.setScene ( scene);
        primaryStage.show();
    }
}














































