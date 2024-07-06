package com.example.scenebuider1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;

public class HelloController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void Up(javafx.event.ActionEvent actionEvent) {
        //System.out.println("up");
        myCircle.setCenterY(y-=10);

    }

    public void Left(javafx.event.ActionEvent actionEvent) {
        //System.out.println("left");
        myCircle.setCenterX(x-=10);
    }

    public void Right(javafx.event.ActionEvent actionEvent) {
        //System.out.println("right");
        myCircle.setCenterX(x+=10);
    }

    public void Down(javafx.event.ActionEvent actionEvent) {
        //System.out.println("down");
        myCircle.setCenterY(y+=10);
    }
}