package dk.kyuff.layouts.apps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class TwoColumnApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL resource = getClass().getResource("/column_layout_2.fxml");
        Parent view = FXMLLoader.load(resource);

        primaryStage.setTitle("Two Column Layout");
        primaryStage.setScene(new Scene(view, 500, 800));
        primaryStage.show();

    }
}
