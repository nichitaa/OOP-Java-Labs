package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("assets/sample.fxml")); // main window
        primaryStage.getIcons().add(new Image(getClass().getResource("assets/icon.jpg").toURI().toString())); // window icon
        primaryStage.setTitle("Lab - 9 JavaFX."); // window title
        Scene scene = new Scene(root, 680, 415); // window dimensions
        primaryStage.setScene(scene);
        scene.getStylesheets().add("/sample/assets/styles.css"); // custom styles
        primaryStage.setResizable(false); // window will not be resizable
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
