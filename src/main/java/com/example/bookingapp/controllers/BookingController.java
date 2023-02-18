package com.example.bookingapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingapp.response.DataResponse;
import com.example.bookingapp.services.BookingService;
import com.example.bookingapp.models.Book;
import com.example.bookingapp.requests.BookEvent;

import java.util.List;

@RestController
@RequestMapping("booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAllBookingsForEvent(@PathVariable int id) {
        List<Book> lBooks = this.bookingService.getAllBookingsForEvent(id);
        return new ResponseEntity<>(new DataResponse("Successfull", lBooks), HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBooking(@RequestBody BookEvent b) {
        this.bookingService.saveBooks(new Book(b));
        return new ResponseEntity<>(new DataResponse("Successfull", null), HttpStatus.CREATED);
    }
}
