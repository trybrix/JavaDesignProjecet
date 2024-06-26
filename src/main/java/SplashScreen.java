package com.example.javadesignprojecet;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SplashScreen extends Application{

    @Override
    public void start(Stage primaryStage) {
        //screen text/label
        Label splashLabel = new Label("Welcome to My App");

        //make splash screen image
        Image splashImage = new Image(getClass().getResourceAsStream("/com/example/javadesignprojecet/logo.png"));
        ImageView splashImageView = new ImageView(splashImage);
        splashImageView.setFitWidth(200);
        splashImageView.setFitHeight(200);


        //stackpane - layout pane in JavaFX that lays out its children in a stack
        StackPane splashLayout = new StackPane();
        splashLayout.getChildren().addAll(splashImageView, splashLabel);

        //splashLayout - half of the actual screen: 800, 600
        Scene splashScene = new Scene(splashLayout, 400, 300);


        //primaryStage
        primaryStage.setScene(splashScene);
        primaryStage.show();

        //3sec dur
        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event->{
            primaryStage.close();
            showMainStage();
        });
        delay.play();

    }

    private void showMainStage(){
        HelloApplication mainApp = new HelloApplication();
        Stage mainStage = new Stage();
        mainApp.start(mainStage);

    }

    public static void main(String[] args){
        launch(args);

    }

}


