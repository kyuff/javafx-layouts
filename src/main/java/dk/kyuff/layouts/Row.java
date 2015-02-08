package dk.kyuff.layouts;

import javafx.scene.Node;
import javafx.scene.layout.Region;

public class Row {

    private static final double ROW_HEIGHT = 30.0;
    public static final double ROW_VGAP = 10.0;

    public static void setSpan(Region node, int span) {
        double prefHeight = calculateHeight(span);
        node.setPrefHeight(prefHeight);
        node.getProperties().put(Row.class, span);
    }

    public static boolean isRowSpanUndefined(Region node) {
        return node.getProperties().get(Row.class) == null;
    }

    public static int getSpan(Node node) {
        return 0;
    }

    private static double calculateHeight(int span) {
        switch (Math.abs(span)) {
            case 0:
            case 1:
                return ROW_HEIGHT;
            default:
                return (span * ROW_HEIGHT) + ((span - 1) * ROW_VGAP);
        }
    }
}
