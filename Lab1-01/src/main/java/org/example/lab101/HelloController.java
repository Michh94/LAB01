package org.example.lab101;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label courseNameAndMyName;

    @FXML
    private Text message;

    @FXML
    protected void showMessage() {
        message.setText("Welcome to Lab-01");
    }
}