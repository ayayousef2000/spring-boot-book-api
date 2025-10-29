package com.example.books.service;

import com.example.books.entity.Book;
import com.example.books.exception.ResourceNotFoundException;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));

        existingBook.setTitle(bookDetails.getTitle());
        existingBook.setAuthor(bookDetails.getAuthor());
        existingBook.setYear(bookDetails.getYear());
        existingBook.setDescription(bookDetails.getDescription());

        return bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new ResourceNotFoundException("Book", "id", id);
        }
        bookRepository.deleteById(id);
    }
}
