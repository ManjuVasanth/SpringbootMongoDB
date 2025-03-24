package com.manju.books_store.mapper;

import com.manju.books_store.dto.BookDto;
import com.manju.books_store.entity.Book;

public class BookMapper {
    // Converting Entity to Dto
    public static BookDto toDto(Book book) {
        if (book == null) {
            return null;
        }
        return new BookDto(book.bookId(), book.name(), book.price(), book.author(), book.description());
    }

    // Converting Dto to Entity
    public static Book toEntity(BookDto bookDto) {
        if (bookDto == null) {
            return null;
        }
        return new Book(bookDto.bookId(), bookDto.name(), bookDto.price(), bookDto.author(), bookDto.description());
    }
}

