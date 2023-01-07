package com.example.medicalapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ListPatientController extends BorderPane {
    public ListPatientController(){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Liste-Patients.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        // fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
