package com.example.bookingapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookingapp.models.Event;
import com.example.bookingapp.repositories.EventRepository;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        List<Event> eList = new ArrayList<>();
        this.eventRepository.findAll().forEach(e -> eList.add(e));
        return eList;
    }

    public void addEvent(Event e) {
        this.eventRepository.save(e);
    }
}
