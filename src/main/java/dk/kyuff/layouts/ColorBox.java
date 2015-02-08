package dk.kyuff.layouts;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ColorBox extends VBox {

    private ObjectProperty<Color> color;
    private Label label;


    public ColorBox() {
        label = new Label();
        label.setTextFill(Color.AQUA);
        getChildren().add(label);
        setAlignment(Pos.CENTER);
        widthProperty().addListener((obs, oldValue, newValue) -> {
            redrawLabel();
        });
        heightProperty().addListener((obs, oldValue, newValue) -> {
            redrawLabel();
        });
    }

    private void redrawLabel() {
        String text = String.format("%sx%spx", new Double(getWidth()).intValue(), new Double(getHeight()).intValue());
        label.setText(text);
    }

    public ObjectProperty<Color> colorProperty() {
        if (color == null) {
            color = new SimpleObjectProperty<>();
            color.addListener((obs, oldValue, newValue) -> {
                BackgroundFill fill = new BackgroundFill(newValue, null, null);
                Background background = new Background(fill);
                setBackground(background);
            });
        }
        return color;
    }

    public Color getColor() {
        return colorProperty().get();
    }

    public void setColor(Color newColor) {
        colorProperty().setValue(newColor);
    }
}
