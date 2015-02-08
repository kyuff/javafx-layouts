package dk.kyuff.layouts;

import javafx.beans.property.StringProperty;
import javafx.scene.control.TextField;

public class LabeledTextField extends LabeledControl {

    TextField textField;

    public LabeledTextField() {
        textField = init(new TextField());
    }

    public StringProperty inputText() {
        return textField.textProperty();
    }

    public void setInputText(String inputText) {
        textField.setText(inputText);
    }

    public String getInputText() {
        return textField.getText();
    }

}
