package com.example.bookingapp.requests;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookEvent {
    public int eventId;
    @JsonFormat(pattern = "yyyy-mm-dd")
    public Date date;
    public String name;
    public String email;
    public String phone;
}
