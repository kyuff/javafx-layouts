package dk.kyuff.layouts;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class TwoColumnLayout extends BaseColumnLayout {

    private static final double COLUMN_WIDTH = 170.0;

    FlowPane leftColumn;
    FlowPane rightColumn;

    public TwoColumnLayout() {
        leftColumn = setupColumn(COLUMN_WIDTH, 0);
        rightColumn = setupColumn(COLUMN_WIDTH, 1);

    }

    public ObservableList<Node> getLeftColumn() {
        return leftColumn.getChildren();
    }

    public ObservableList<Node> getRightColumn() {
        return rightColumn.getChildren();
    }
}
