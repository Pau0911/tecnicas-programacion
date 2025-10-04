package co.edu.udea.tecnicas.ejemplofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

      /*  TextField num1 = new TextField();
        TextField num2 = new TextField();
        Button sumarBtn = new Button("Sumar");
        Label resultado = new Label();

        sumarBtn.setOnAction(event -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            resultado.setText("Resultado: " + (a + b));
        });

        HBox hBox = new HBox(10, num1, num2, sumarBtn);//Fila
        VBox vBox = new VBox(15, hBox, resultado); //Columna

        Scene scene = new Scene(vBox,400,400);
        stage.setTitle("Calculadora de suma");
        stage.setScene(scene);
        stage.show();
*/
        Label lblUser = new Label("Usuario: ");
        TextField txtUser = new TextField();
        Label lblPass = new Label("Contraseña: ");
        PasswordField txtPass = new PasswordField();
        Button btnLogin = new Button("Iniciar sesión");

        btnLogin.setOnAction(e -> {
            String usuario = txtUser.getText().trim();
            String password = txtPass.getText().trim();

            if(usuario.equals("amin")&& password.equals("1234")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Login exitoso");
                alert.setContentText("Bienvenido, " + usuario + "!");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de login");
                alert.setContentText("Usuario o contraseña incorrectos.");
                alert.showAndWait();
            }
        });

        VBox vBox = new VBox(10, lblUser, txtUser, lblPass, txtPass, btnLogin);
        vBox.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 10;");

        Scene scene = new Scene(vBox,400,400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
