package dk.kyuff.layouts;

import javafx.beans.property.StringProperty;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class LabeledControl extends HBox {

    private Label label;


    public LabeledControl() {
        label = new Label();
        label.setPrefWidth(70.0);
        getChildren().add(label);
    }

    protected <T extends Control> T init(T control) {
        label.setLabelFor(control);
        getChildren().add(control);
        label.setOnMouseClicked(event -> {
            control.requestFocus();
        });
        return control;
    }

    public StringProperty labelText() {
        return label.textProperty();
    }

    public void setLabelText(String labelText) {
        label.setText(labelText);
    }

    public String getLabelText() {
        return label.getText();
    }

}
