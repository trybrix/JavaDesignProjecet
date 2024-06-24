package com.example.javadesignprojecet;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application{


    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("JavaFX Design Project");

        //menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu themeMenu = new Menu("Theme");
        Menu helpMenu = new Menu("Help");
        menuBar.getMenus().addAll(fileMenu, editMenu, themeMenu, helpMenu);

        //TV
        TableView<Student> tableView = new TableView<>();
        TableColumn<Student, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Student, String> firstNameColumn = new TableColumn<>("First Name");
        TableColumn<Student, String> lastNameColumn = new TableColumn<>("Last Name");
        TableColumn<Student, String> departmentColumn = new TableColumn<>("Department");
        TableColumn<Student, String> majorColumn = new TableColumn<>("Major");
        TableColumn<Student, String> emailColumn = new TableColumn<>("Email");

        //left text allign - no clue y its not working
//        idColumn.setStyle("-fx-alignment: LEFT-CENTER;");
//        firstNameColumn.setStyle("-fx-alignment: LEFT;");
//        lastNameColumn.setStyle("-fx-alignment: CENTER-LEFT;");
//        departmentColumn.setStyle("-fx-alignment: CENTER-LEFT;");
//        majorColumn.setStyle("-fx-alignment: CENTER-LEFT;");
//        emailColumn.setStyle("-fx-alignment: CENTER-LEFT;");


        tableView.getColumns().addAll(idColumn, firstNameColumn, lastNameColumn, departmentColumn, majorColumn, emailColumn);


        //logo
        Image image = new Image(getClass().getResourceAsStream("/com/example/javadesignprojecet/logo.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        VBox imageContainer = new VBox(imageView);
        imageContainer.setPadding(new Insets(10));

//        not working - the bg should be brown but its gray/white
//        imageContainer.setStyle("-fx-background-color: #A0522D;");
//        imageContainer.getStyleClass().add("image-view");

        //ctrls
        VBox controls = new VBox();
        controls.setPadding(new Insets(10));
        controls.setStyle("-fx-background-color: #ADFF2F;");

        TextField firstNameField = new TextField();
        firstNameField.setPromptText("First Name");
        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Last Name");
        TextField departmentField = new TextField();
        departmentField.setPromptText("Department");
        TextField majorField = new TextField();
        majorField.setPromptText("Major");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        TextField imageURLField = new TextField();
        imageURLField.setPromptText("imageURL");


        Button clearButton = new Button("Clear");
        clearButton.setMaxWidth(Double.MAX_VALUE);
        Button addButton = new Button("Add");
        addButton.setMaxWidth(Double.MAX_VALUE);
        Button deleteButton = new Button("Delete");
        deleteButton.setMaxWidth(Double.MAX_VALUE);
        Button editButton = new Button("Edit");
        editButton.setMaxWidth(Double.MAX_VALUE);


        VBox buttonContainer = new VBox(10, clearButton, addButton, deleteButton, editButton);
        //not working - buttons should be at bot-cen - no clue
//        buttonContainer.setAlignment(Pos.BOTTOM_CENTER);
//        clearButton.setAlignment(Pos.BOTTOM_CENTER);

        controls.getChildren().addAll(firstNameField, lastNameField, departmentField, majorField, emailField, imageURLField, buttonContainer);


        //BP layout
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(tableView);
        layout.setRight(controls);
        layout.setLeft(imageView);

        Scene scene = new Scene(layout, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/com/example/javadesignprojecet/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);

    }

}


