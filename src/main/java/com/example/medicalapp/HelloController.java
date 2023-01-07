package com.example.medicalapp;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnClose;

    @FXML
    private Button btnLogin;

    @FXML
    private Label error_message;

    @FXML
    private PasswordField ftPassword;

    @FXML
    private TextField tfUsername;

    private static double xOffset=0;
    private static double yOffset=0;

private String errormsg="";

   private boolean isEmpty(){
       boolean khawi=true;
       if(tfUsername.getText().isEmpty()){
           khawi=false;
           errormsg="Username is Empty";
       }

       if(ftPassword.getText().isEmpty()){
           khawi=false;
           if(errormsg.isEmpty()){
               errormsg="Password is Empty";
           }else{
               errormsg+="\nPassword is Empty";
           }
       }
       error_message.setText(errormsg);

       return khawi;

   }



   private boolean isValid(){
       boolean isValid=true;
       if(!tfUsername.getText().equals(HelloApplication.USERNAME)){
           isValid=false;
           errormsg="Invalid Username";
       }
       if(!ftPassword.getText().equals(HelloApplication.PASSWORD)){
           isValid=false;
           if(errormsg.isEmpty()){
               errormsg="Invalid Password";
           }else{
               errormsg+="\nInvalid Password";
           }
       }
       error_message.setText(errormsg);
       return isValid;


   }



    private void startDashboard(){



        try {
            Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dash.fxml")));
            Stage stage =new Stage();
            stage.setMaximized(true);
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setFullScreen(true);
            stage.setResizable(false);

            //drag
            root.setOnMousePressed(event ->{

                xOffset = stage.getX() - event.getScreenX();
                yOffset = stage.getY() - event.getScreenY();
            });
            //drag
            root.setOnMouseDragged(event ->{
                stage.setX(event.getScreenX() + xOffset);
                stage.setY(event.getScreenY() + yOffset);

            });




            stage.show();





        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void CloseLogin(){


            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       btnClose.setOnMouseClicked(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               System.exit(0);
           }
       });

       btnLogin.setOnMouseClicked(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               errormsg="";
               if(isEmpty() && isValid()){
                   //nextpage
                   CloseLogin();
                   startDashboard();
               }
           }
       });
    }


}
