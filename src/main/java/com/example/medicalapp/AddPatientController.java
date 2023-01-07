package com.example.medicalapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class AddPatientController extends BorderPane implements Initializable  {

    @FXML
    private Button addBtn;

    @FXML
    private TextField age;

    @FXML
    private TextField cne;

    @FXML
    private TextField email;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private TextField tel;

    public AddPatientController(){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Add-Patient.fxml"));
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

        addBtn.setOnMouseClicked(mouseEvent -> {
        });

    }
    }
