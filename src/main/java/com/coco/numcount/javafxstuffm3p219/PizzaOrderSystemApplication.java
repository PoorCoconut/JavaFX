package com.coco.numcount.javafxstuffm3p219;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaOrderSystemApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(NumberCounterApplication.class.getResource("pizza-order-system.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 440);
        stage.setTitle("Pizza Order System");
        stage.setScene(scene);
        stage.show();
    }
}
