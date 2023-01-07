package com.example.medicalapp;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class homeController extends BorderPane implements Initializable  {





    @FXML
    private TableColumn<TestModel, String> d;

    @FXML
    private TableColumn<TestModel, String> n;

    @FXML
    private TableColumn<TestModel, String> s;

    @FXML
    private TableView<TestModel> tbd;




    public homeController(){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
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


        n.setCellValueFactory(new PropertyValueFactory<>("Name"));
        d.setCellValueFactory(new PropertyValueFactory<>("Date"));
        s.setCellValueFactory(new PropertyValueFactory<>("Status"));

        tbd.setItems(studentsModels);



    }

    private ObservableList<TestModel> studentsModels = FXCollections.observableArrayList(
            new TestModel("Adil","Date1" , "Chepchieng"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt"),
            new TestModel("Houssam","Date1" , "Satt")
            );


    }






















