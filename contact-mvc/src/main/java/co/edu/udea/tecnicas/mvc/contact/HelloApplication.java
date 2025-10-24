package co.edu.udea.tecnicas.mvc.contact;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("contact-view.fxml"));
        Scene scene = new Scene(loader.load(), 400, 400);
        stage.setTitle("Gestor de Contactos (MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);
    }
}
