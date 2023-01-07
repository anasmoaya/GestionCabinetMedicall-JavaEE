package com.example.medicalapp;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RdvController extends BorderPane implements Initializable {
    @FXML
    private Button AddRdv;

    @FXML
    private DatePicker DatePicker;

    @FXML
    private ComboBox<?> Patients;

    @FXML
    private TextField Search;

    @FXML
    private Button SearchBtn;

    @FXML
    private TableView<?> tableView;
    public RdvController(){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Rdv.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        // fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        SearchBtn.setOnMouseClicked(mouseEvent -> {
            //Query search
        });
        AddRdv.setOnMouseClicked(mouseEvent -> {
            //Add rdv
        });

    }
}
