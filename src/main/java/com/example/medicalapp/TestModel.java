package com.example.medicalapp;

import javafx.beans.property.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestModel {


    private SimpleStringProperty Name;
    private SimpleStringProperty Date;

    public TestModel(String adil, String date1, String chepchieng) {

        this.Name=new SimpleStringProperty(adil);
        this.Status=new SimpleStringProperty(chepchieng);
        this.Date=new SimpleStringProperty(date1);
    }

    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public void setName(String name) {
        this.Name.set(name);
    }

    public SimpleStringProperty getDate() {
        return Date;
    }

    public void setDate(SimpleStringProperty date) {
        Date = date;
    }

    public String getStatus() {
        return Status.get();
    }

    public SimpleStringProperty statusProperty() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status.set(status);
    }

    private SimpleStringProperty  Status;









}
