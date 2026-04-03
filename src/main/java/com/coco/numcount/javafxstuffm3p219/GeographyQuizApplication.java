package com.coco.numcount.javafxstuffm3p219;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeographyQuizApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(NumberCounterApplication.class.getResource("geography-quiz.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("Geography Quiz");
        stage.setScene(scene);
        stage.show();
    }
}
