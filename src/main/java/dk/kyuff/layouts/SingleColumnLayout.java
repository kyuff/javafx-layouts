package dk.kyuff.layouts;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class SingleColumnLayout extends BaseColumnLayout {

    public static final double COLUMN_WIDTH = 240.0;

    FlowPane column;

    public SingleColumnLayout() {
        column = setupColumn(COLUMN_WIDTH, 0);
    }

    public ObservableList<Node> getColumn() {
        return column.getChildren();
    }

}
