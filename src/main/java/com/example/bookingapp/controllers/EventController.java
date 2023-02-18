package com.example.bookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingapp.models.Event;
import com.example.bookingapp.requests.AddEvent;
import com.example.bookingapp.response.DataResponse;
import com.example.bookingapp.services.EventService;

import java.util.List;

@RestController
@RequestMapping("event")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<?> getAllEvents() {
        List<Event> aEvents = this.eventService.getAllEvents();
        return new ResponseEntity<>(new DataResponse("Successfull", aEvents), HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEvent(@RequestBody AddEvent e) {
        System.out.println(e.date.toString());
        this.eventService.addEvent(new Event(e));
        return new ResponseEntity<>(new DataResponse("Successfull", null), HttpStatus.CREATED);
    }

}
