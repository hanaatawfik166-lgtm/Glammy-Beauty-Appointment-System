package com.example.glammy.model;

public class Appointment {

    private String name;
    private String service;
    private String date;
    private String time;

    public Appointment(String name, String service, String date, String time) {
        this.name = name;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getService() {
        return service;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}