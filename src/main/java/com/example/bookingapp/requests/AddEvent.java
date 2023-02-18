package com.example.bookingapp.requests;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AddEvent {

    public String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date date;
    public String email;
    public String phone;
    public String description;
    public String eventType;
    public String eventLocation;
    public String eventStatus;
    public int maxSeats;

}
