package ru.shafigullina.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField r1TextField;

    @FXML
    private TextField r2TextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField s1TextField;

    @FXML
    private TextField s2TextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float R1 = Float.parseFloat(r1TextField.getText().toString());
        float R2 = Float.parseFloat(r2TextField.getText().toString());

        float S1 = (float) (Math.PI * R1 * R1); // Площадь первого круга
        float S2 = (float) (Math.PI * R2 * R2); // Площадь второго круга
        float S3 = S1 - S2; // Площадь кольца

        resLabel.setText("S1=" + S1 + ", S2=" + S2 + ", S3=" + S3);
    }

}
