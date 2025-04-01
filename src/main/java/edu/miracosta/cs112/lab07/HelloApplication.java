package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label message = new Label("Hello World!");
        Label label = new Label();
        button = new Button("Click me!");

        StackPane layout = new StackPane();
        AnchorPane anchorPane = new AnchorPane();

        layout.getChildren().add(message);
        layout.getChildren().add(button);
        layout.getChildren().add(anchorPane);
        anchorPane.getChildren().add(label);


        Scene scene = new Scene(layout, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello GUI : Sarah");
        label.setText("Hello GUI World!");
        anchorPane.setBottomAnchor(label, 0.0);
        anchorPane.setRightAnchor(label, 0.0);
        primaryStage.show();
    }

    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button) {
            System.out.println("Hello World!");
        }
}

    // TODO: follow steps 2-9 in README.md to create a start method

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
}