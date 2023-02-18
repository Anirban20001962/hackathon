package com.example.bookingapp.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Event {
    @Id
    private int id;
    private String name;
    private Date date;
    private String email;
    private String phone;
    private String description;
    private String eventType;
    private String eventLocation;
    private String eventStatus;
    private int maxSeats;
}
