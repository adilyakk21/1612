package ru.shafigullina.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double A = Double.parseDouble(aTextField.getText().toString());
        double A2= A * A;
        double A3= A2 * A;
        double A5 = A3 * A2;
        double A1O = A5 * A5;
        double A15 = A1O * A5;
        resButton.setText("A^2=" + A2 + "A^3=" + A3+ "A^5=" + A5 + "A^10=" + A1O + "A^15="+ A15);
    }

}
