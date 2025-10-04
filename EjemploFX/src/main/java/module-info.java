module co.edu.udea.tecnicas.ejemplofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.udea.tecnicas.ejemplofx to javafx.fxml;
    exports co.edu.udea.tecnicas.ejemplofx;
}