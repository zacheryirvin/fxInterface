package fxBuild;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.xml"));
        // GridPane root = new GridPane();
        // Label greeting = new Label("Welcome to JavaFx");
        // greeting.setTextFill(Color.GREEN);
        // greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        // root.getChildren().add(greeting);
        // root.setAlignment(Pos.CENTER);
        // root.setVgap(10);
        // root.setHgap(10);
        primaryStage.setTitle("Hello JavaFx!!");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
