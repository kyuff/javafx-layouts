package dk.kyuff.layouts;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class ThreeColumnLayout extends BaseColumnLayout {

    private static final double DEFAULT_COLUMN_WIDTH = 120.0;

    FlowPane leftColumn;
    FlowPane centerColumn;
    FlowPane rightColumn;

    public ThreeColumnLayout() {
        this(DEFAULT_COLUMN_WIDTH);
    }

    public ThreeColumnLayout(double columnWidth) {
        leftColumn = setupColumn(columnWidth, 0);
        centerColumn = setupColumn(columnWidth, 1);
        rightColumn = setupColumn(columnWidth, 2);
    }

    public ObservableList<Node> getLeftColumn() {
        return leftColumn.getChildren();
    }

    public ObservableList<Node> getCenterColumn() {
        return centerColumn.getChildren();
    }

    public ObservableList<Node> getRightColumn() {
        return rightColumn.getChildren();
    }

}
