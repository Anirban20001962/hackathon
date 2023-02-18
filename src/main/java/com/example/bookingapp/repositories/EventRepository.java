package com.example.bookingapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.bookingapp.models.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
