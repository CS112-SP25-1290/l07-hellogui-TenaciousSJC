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

public class HelloApplication extends Application implements EventHandler<ActionEvent>  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    private Button button;
    private Button button2;
    private Button button3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label message = new Label("Push my buttons!");
        Label label = new Label();
        Label label2 = new Label();
        button = new Button("Click me!");
        button2 = new Button("No click me!");
        button3 = new Button("NO click me!");

        StackPane layout = new StackPane();
        AnchorPane anchorPane = new AnchorPane();

        layout.getChildren().add(message);
        layout.getChildren().add(button);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);
        layout.getChildren().add(anchorPane);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label2);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);






        primaryStage.setTitle("Hello GUI : Sarah");
        label.setText("Hello GUI World <3");
        label2.setText("Kickass in CS!");
        AnchorPane.setTopAnchor(label, 5.0);
        AnchorPane.setLeftAnchor(label, 5.0);
        AnchorPane.setTopAnchor(label2,5.0);
        AnchorPane.setRightAnchor(label2, 5.0);
        AnchorPane.setBottomAnchor(button, 10.0);
        AnchorPane.setLeftAnchor(button, 10.0);
        AnchorPane.setBottomAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 118.0);
        AnchorPane.setBottomAnchor(button3, 10.0);
        AnchorPane.setRightAnchor(button3, 10.0);


        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button) {
            System.out.println("I have amazing day!");
        } else{
            if(actionEvent.getSource() == button2) {
                System.out.println("You're the goat!");
            }

            if (actionEvent.getSource() == button3) {
                System.out.println("Don't get lost in the sauce!");
            }
        }
}

    // TODO: follow steps 2-9 in README.md to create a start method

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
}