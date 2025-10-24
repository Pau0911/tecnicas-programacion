module co.edu.udea.tecnicas.ejercicio2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.udea.tecnicas.mvc.contact to javafx.fxml;
    exports co.edu.udea.tecnicas.mvc.contact.controller;
    exports co.edu.udea.tecnicas.mvc.contact;
    opens co.edu.udea.tecnicas.mvc.contact.controller to javafx.fxml;
}