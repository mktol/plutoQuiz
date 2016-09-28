package org.pluto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.pluto.controller.RootController;

/**
 * This is General class for running application
 */
public class MainApp extends Application{

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        String fxmlFile = "/fxml/RootLayout.fxml";
        String fxmlFile = "/fxml/TopWindow.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("Quiz system");

        RootController rootController = loader.getController();
        rootController.setMain(this);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
