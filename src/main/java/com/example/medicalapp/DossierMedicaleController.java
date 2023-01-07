package com.example.medicalapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;


public class DossierMedicaleController extends BorderPane {

    @FXML
    private Button AddBtn;

    @FXML
    private TextArea observation;

    @FXML
    private ComboBox<?> patients;

    public DossierMedicaleController(){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dossier_Medicale.fxml"));
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

        AddBtn.setOnMouseClicked(mouseEvent -> {
            //Add DossierMedicale
        });

    }


}
