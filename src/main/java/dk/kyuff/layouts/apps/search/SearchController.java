package dk.kyuff.layouts.apps.search;

import dk.kyuff.layouts.LabeledTextField;
import dk.kyuff.layouts.SearchLayout;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    LabeledTextField name;
    @FXML
    LabeledTextField color;
    @FXML
    LabeledTextField dolls;
    @FXML
    LabeledTextField age;
    @FXML
    SearchLayout<Person> layout;

    DataBase db;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        db = new DataBase();
    }

    @FXML
    public void onSearch(ActionEvent event) {
        int valueAge = 0;
        try {
            valueAge = Integer.parseInt(age.getInputText());
        } catch (NumberFormatException e) {
            // ignore
        }
        String valueName = name.getInputText();
        String valueColor = color.getInputText();
        String valueDolls = dolls.getInputText();
        List<Person> searchResult = db.search(valueAge, valueName, valueColor, valueDolls);
        layout.setSearchResult(searchResult);
    }


}
