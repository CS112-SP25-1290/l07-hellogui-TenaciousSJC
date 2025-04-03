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
import javafx.scene.control.TextField;

public class HelloApplication extends Application implements EventHandler<ActionEvent>  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    private Button button;
    private Button button2;
    private Button button3;
    private Label messageLabel;
    private Label countLabel;
    private int button2Clicked = 0;
    private TextField inputField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        messageLabel = new Label("Push my buttons!");
        Label label = new Label();
        button = new Button("Click me!");
        button2 = new Button("No click me!");
        button3 = new Button("NO click me!");
        countLabel = new Label();
        inputField = new TextField();
        inputField.setPromptText("Enter text here...");

        button.setOnAction(this);
        button2.setOnAction(this);
        button3.setOnAction(this);

        StackPane layout = new StackPane();
        AnchorPane anchorPane = new AnchorPane();

        layout.getChildren().add(messageLabel);
        layout.getChildren().add(button);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);
        layout.getChildren().add(anchorPane);
        layout.getChildren().add(countLabel);
        layout.getChildren().add(inputField);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);
        anchorPane.getChildren().add(countLabel);
        anchorPane.getChildren().add(inputField);






        primaryStage.setTitle("Hello GUI : Sarah");
        label.setText("Kickass in CS!");
        countLabel.setText("Hello GUI World!<3");
        AnchorPane.setTopAnchor(label, 5.0);
        AnchorPane.setLeftAnchor(label, 5.0);
        AnchorPane.setTopAnchor(countLabel,5.0);
        AnchorPane.setRightAnchor(countLabel, 5.0);
        AnchorPane.setBottomAnchor(button, 10.0);
        AnchorPane.setLeftAnchor(button, 10.0);
        AnchorPane.setBottomAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 118.0);
        AnchorPane.setBottomAnchor(button3, 10.0);
        AnchorPane.setRightAnchor(button3, 10.0);
        AnchorPane.setTopAnchor(inputField, 100.0);
        AnchorPane.setLeftAnchor(inputField, 80.0);
        inputField.setPrefWidth(150);


        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            String enteredText = inputField.getText().trim();
            if (!enteredText.isEmpty()) {
                messageLabel.setText(enteredText);
            } else {
                messageLabel.setText("No text entered!");
            }
        } else if (actionEvent.getSource() == button2) {
            button2Clicked ++;
            countLabel.setText("\"No click me!\" button clicked: " + button2Clicked + " times.");
        } else if (actionEvent.getSource() == button3) {
            messageLabel.setText("The only way to do great work is to love what you do!" + "\n                              -Steve Jobs");
        }
    }


    // TODO: follow steps 2-9 in README.md to create a start method

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
}