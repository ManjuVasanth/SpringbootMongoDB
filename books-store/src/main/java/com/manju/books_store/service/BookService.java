package com.manju.books_store.service;

import com.manju.books_store.dto.BookDto;
import com.manju.books_store.entity.Book;

import java.util.List;

public interface BookService {
    public BookDto getBook(String bookId);
    public List<BookDto> getAllBooks();
    public BookDto createBook(BookDto bookDto);
    public BookDto updateBookName(BookDto bookDto);
    public void deleteBookByBookId(String bookId);

}
