package com.issa.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    /*
    My notes:
    * When we run the application, 'Application.launch()' will be called from main()
       - Doesn't return until application is exited.
    * Init method runs first
        - Empty & doesn't do anything
    * Start Method runs next
        - We override Start to create the UI
    * Stop Method runs (when close application)
        - Empty, need to override it
    */


    @Override
    public void start(Stage stage) throws IOException {
        //Stage is essentially Main Window - Stage is top level container which extends window class
        // - Most applications only have one "top level" window, = 1 stage
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Information pulled from fxml file like where controller is saved in fmxlloader object
        Scene scene = new Scene(fxmlLoader.load(), 1060, 540);
        /*
        Instead of using FXMLLoader, we can do everything in code below.
        (Best Practice is to use FXML File)

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Label greeting = new Label("Welcome to JavaFX!");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(greeting);

        Scene scene = new Scene(root, 1060, 540);
        */
        //We make a new scene (window) with width (v1) and height (v)
        stage.setTitle("Hello JavaFX!");
        //Window title set to "Hello!"
        stage.setScene(scene);
        //Each stage requires a scene
        // - Only one stage, but can have multiple scenes
        // - Every scene has a scene graph (?) - a tree where each node corresponds to a UI control/part of scene
        // - In Short, if we want to change the UI we would change the scene in 'stage.setScene()'
        // *Example*: Install Wizard -> When user presses next or previous, we would change scenes
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}