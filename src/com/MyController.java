package com;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MyController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void print(){
        System.out.println("HELLO My Control PRINT");
    }
    @FXML
    public void exit(){
        System.exit(0);
    }
}
