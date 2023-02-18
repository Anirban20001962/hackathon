package com.example.bookingapp.models;

import java.util.Date;

import com.example.bookingapp.requests.AddEvent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
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
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String eventType;
    @Column(nullable = false)
    private String eventLocation;
    @Column(nullable = false)
    private String eventStatus;
    @Column(nullable = false)
    private int maxSeats;

    public Event(AddEvent e) {
        this.name = e.name;
        this.date = e.date;
        this.email = e.email;
        this.phone = e.phone;
        this.description = e.description;
        this.eventType = e.eventType;
        this.eventStatus = e.eventStatus;
        this.maxSeats = e.maxSeats;
        this.eventLocation = e.eventLocation;
    }
}
