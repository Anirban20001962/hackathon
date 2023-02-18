package com.example.bookingapp.services;

import com.example.bookingapp.models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.bookingapp.repositories.BookRepository;

@Service
public class BookingService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBookingsForEvent(int eventId) {
        List<Book> books = new ArrayList<>();
        this.bookRepository.findAll().forEach(t -> books.add(t));
        books.stream()
                .filter(b -> b.getEvent().getId() == eventId).collect(Collectors.toList());
        return books;
    }

    public void saveBooks(Book b) {
        this.bookRepository.save(b);
    }
}
