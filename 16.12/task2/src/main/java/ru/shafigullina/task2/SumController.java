package ru.shafigullina.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float x = Float.parseFloat(xTextField.getText().toString());

        float value = (float) (4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 6) + 2);
        resLabel.setText("y=" + value);
    }

}
