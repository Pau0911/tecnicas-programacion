module co.edu.udea.tecnicas.multiventanas {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.udea.tecnicas.multiventanas to javafx.fxml;
    exports co.edu.udea.tecnicas.multiventanas;
}