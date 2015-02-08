package dk.kyuff.layouts.apps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class SearchApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL resource = getClass().getResource("/search_result_view.fxml");
        Parent view = FXMLLoader.load(resource);

        primaryStage.setTitle("Search Layout");
        primaryStage.setScene(new Scene(view, 800, 600));
        primaryStage.show();


    }
}
