module co.edu.udea.tecnicas.ejerciciofxclase2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.udea.tecnicas.ejerciciofxclase2 to javafx.fxml;
    exports co.edu.udea.tecnicas.ejerciciofxclase2;
}