package dk.kyuff.layouts;

import javafx.collections.ListChangeListener;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

public class BaseColumnLayout extends GridPane {

    public BaseColumnLayout() {
        setHgap(30.0);
    }

    FlowPane setupColumn(double prefWidth, int columnIndex) {
        FlowPane column = new FlowPane();
        column.setVgap(Row.ROW_VGAP);
        column.setPrefWrapLength(prefWidth);
        column.getChildren().addListener((ListChangeListener<Node>) change -> {
            change.next();
            change.getAddedSubList().forEach(node -> {
                Region region = (Region) node;
                region.setPrefWidth(prefWidth);
                if (Row.isRowSpanUndefined(region)) {
                    Row.setSpan(region, 1);
                }
            });
        });
        add(column, columnIndex, 0);
        return column;
    }
}
