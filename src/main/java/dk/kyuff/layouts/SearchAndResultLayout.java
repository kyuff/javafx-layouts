package dk.kyuff.layouts;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;

public class SearchAndResultLayout<T> extends FlowPane {

    ThreeColumnLayout searchBox;
    TableView<T> resultBox;
    Button searchButton;

    FlowPane leftColumn;
    FlowPane centerColumn;

    ObservableList<TableColumn<T, ?>> tableColumns;

    public SearchAndResultLayout() {
        searchBox = new ThreeColumnLayout(200.0);

        resultBox = new TableView<>();
        resultBox.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        searchBox.widthProperty().addListener((obs, oldValue, newValue) -> resultBox.setPrefWidth(newValue.doubleValue()));
        setAlignment(Pos.TOP_CENTER);

        getChildren().addAll(searchBox, resultBox);

        searchButton = new Button();

        FlowPane buttonContainer = new FlowPane(searchButton);
        buttonContainer.setAlignment(Pos.BOTTOM_RIGHT);
        searchBox.getRightColumn().addAll(buttonContainer);
        Row.setSpan(buttonContainer, 3);

    }


    public ObservableList<Node> getLeftColumn() {
        return searchBox.getLeftColumn();
    }

    public ObservableList<Node> getCenterColumn() {
        return searchBox.getCenterColumn();
    }

    /*
     * BUTTON TEXT
     */
    public StringProperty getButtonTextProperty() {
        return searchButton.textProperty();
    }

    public String getButtonText() {
        return getButtonTextProperty().get();
    }

    public void setButtonText(String text) {
        getButtonTextProperty().setValue(text);
    }

    /*
     * SEARCH ACTION
     */

    public ObjectProperty<EventHandler<ActionEvent>> onSearchProperty() {
        return searchButton.onActionProperty();
    }

    public void setOnSearch(EventHandler<ActionEvent> searchHandler) {
        searchButton.setOnAction(searchHandler);
    }

    public EventHandler<ActionEvent> getOnSearch() {
        return searchButton.getOnAction();
    }

    /*
     * TABLE COLUMNS
     */

    public ObservableList<TableColumn<T, ?>> getTableColumns() {
        return resultBox.getColumns();
    }

    /*
     * SEARCH RESULT
     */
    public void setSearchResult(List<T> searchResult) {
        resultBox.setItems(FXCollections.observableList(searchResult));
    }
}