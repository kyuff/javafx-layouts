package dk.kyuff.layouts;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class ThreeColumnLayout extends BaseColumnLayout {

    private static final double COLUMN_WIDTH = 120.0;

    FlowPane leftColumn;
    FlowPane centerColumn;
    FlowPane rightColumn;

    public ThreeColumnLayout() {
        leftColumn = setupColumn(COLUMN_WIDTH, 0);
        centerColumn = setupColumn(COLUMN_WIDTH, 1);
        rightColumn = setupColumn(COLUMN_WIDTH, 2);

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
