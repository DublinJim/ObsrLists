package com.example.obsrlists;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;


public class ObserverlistsControl implements Initializable {

    private ObservableList<String> observableList = FXCollections.observableArrayList("One",
        "Two", "Three");
    @FXML
    private Label lbl1;
    @FXML
    private ComboBox<String> combo1;

    @FXML
    private Button btn2;

    @FXML
    private ListView<String> lstView1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setVisible(false);
        combo1.setItems(observableList);
        lstView1.setItems(observableList);
        btn2.setText("Add Item");
    }

    @FXML
    void changelabel() {
        lbl1.setVisible(true);
        lbl1.setText("Item added");
    }

}

