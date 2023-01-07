package com.example.medicalapp;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DashController  implements Initializable {

    @FXML
    private Button Dossier_btn;

    @FXML
    private Button Homebtn;

    @FXML
    private Button add_patientBtn;

    @FXML
    private Button list_patientBtn;

    @FXML
    private Button rdv_btn;

    @FXML
    private Button closebtn;



    @FXML
    private BorderPane Pane1;




    private void CloseDash(){


        Stage stage = (Stage) closebtn.getScene().getWindow();
        stage.close();
    }



    public void initialize(URL url, ResourceBundle resourceBundle) {
        Homebtn.setOnMouseClicked(mouseEvent -> {
            homeController home = new homeController();
            Pane1.setCenter(home);
        });

        closebtn.setOnMouseClicked(mouseEvent -> CloseDash());



        homeController home = new homeController();
        Pane1.setCenter(home);

        add_patientBtn.setOnMouseClicked(mouseEvent -> {
            AddPatientController pat = new AddPatientController();
            Pane1.setCenter(pat);
        });
       // list_patientBtn.setDisable(true);

        list_patientBtn.setOnMouseClicked(mouseEvent -> {
            ListPatientController lis = new ListPatientController();
            Pane1.setCenter(lis);
        });

        rdv_btn.setOnMouseClicked(mouseEvent -> {
            RdvController rdv = new RdvController();
            Pane1.setCenter(rdv);
        });

        Dossier_btn.setOnMouseClicked(mouseEvent -> {
            DossierMedicaleController DM = new DossierMedicaleController();
            Pane1.setCenter(DM);
        });

    }

}

