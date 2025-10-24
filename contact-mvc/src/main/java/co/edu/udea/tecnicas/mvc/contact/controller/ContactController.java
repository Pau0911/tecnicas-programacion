package co.edu.udea.tecnicas.mvc.contact.controller;

import co.edu.udea.tecnicas.mvc.contact.model.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ContactController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private ListView<String> contactList;

    // Aquí el controlador usa el modelo (Contact)
    private final ArrayList<Contact> contacts = new ArrayList<>();

    @FXML
    private void onAddContact( ) {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            showAlert("Error", "Por favor ingresa nombre y teléfono.");
            return;
        }

        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        nameField.clear();
        phoneField.clear();

        showAlert("Éxito", "Contacto agregado correctamente.");
    }

    @FXML
    private void onShowContacts() {
        contactList.getItems().clear();
        for (Contact c : contacts) {
            contactList.getItems().add(c.toString());
        }
    }

    @FXML
    private void onClearList() {
        contacts.clear();
        contactList.getItems().clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
