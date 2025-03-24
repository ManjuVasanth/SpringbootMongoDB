package com.manju.books_store.controller;

import com.manju.books_store.dto.BookDto;
import com.manju.books_store.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book-store")
public class BookStoreController {
    BookService bookService;

    public BookStoreController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> getBook(@PathVariable String bookId) {
        BookDto bookDto = bookService.getBook(bookId);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        /*List<String> books = new ArrayList<String>();
        books.add("Java");
        books.add("Python");
        books.add("Springboot");*/
        List<BookDto> bookDtoList = bookService.getAllBooks();
        return new ResponseEntity<>(bookDtoList, HttpStatus.OK);


    }

    @PostMapping("/")
    public ResponseEntity<BookDto> createBooks(@RequestBody BookDto bookDto) {
        BookDto bookDto1= bookService.createBook(bookDto);
        return new ResponseEntity<>(bookDto1, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto) {
        BookDto bookDto1= bookService.updateBookName(bookDto);
        return new ResponseEntity<>(bookDto1, HttpStatus.OK);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable String bookId) {
        bookService.deleteBookByBookId(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
