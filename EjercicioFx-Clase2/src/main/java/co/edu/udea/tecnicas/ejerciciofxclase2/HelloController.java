package co.edu.udea.tecnicas.ejerciciofxclase2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onByeeButtonClick() {
        welcomeText.setText("Goodbye from JavaFX Application!");
    }

}
