package com.example.bookingapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.bookingapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
