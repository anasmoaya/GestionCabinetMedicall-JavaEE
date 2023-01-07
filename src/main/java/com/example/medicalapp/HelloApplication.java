package com.example.medicalapp;



import com.cabinetmedical.backend.jcabinemedical.Cabinet.*;

import com.cabinetmedical.backend.jcabinemedical.Entity.Patient;
import com.cabinetmedical.backend.jcabinemedical.doa.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {




    public static final String USERNAME="admin";
    public static final String PASSWORD="123";
    
    private static double xOffset=0;
    private static double yOffset=0;
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));



       root.setOnMousePressed(event ->{
           xOffset = stage.getX() - event.getScreenX();
           yOffset = stage.getY() - event.getScreenY();
        });




        //drag
        root.setOnMouseDragged(event ->{
            stage.setX(event.getScreenX() + xOffset);
            stage.setY(event.getScreenY() + yOffset);

        });

        //center the screen
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);



        //Scene scene = new Scene(fxmlLoader.load(), 780, 460);
        stage.setTitle("Cygwin!");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root));
        stage.show();


       // stage.setScene(scene);


    }


    public static void main(String[] args) {

        try{
            CabinetMedicalDoaImpl cabinetMedicalDoa = new CabinetMedicalDoaImpl();
            Patient p = new Patient();
            p.setAge(2);
            p.setCNE("EE5656490");
            p.setEmail("anasoaya@gmail.cm");
            p.setFname("Anass");
            p.setLname("kjlkjf");
            p.setPhone("0675648589");
            cabinetMedicalDoa.addPatient(p);
            System.out.println("added");
            launch();
        }catch(Exception e){
            System.out.println("error:");
            System.out.println(e.getMessage());
        }




    }
}