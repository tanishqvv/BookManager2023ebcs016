package com.example.bookmanager.service;
/*TANISHQ VIJAY VAIDYA2023EBCS016*/
import com.example.bookmanager.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
    List<Book> getAllBooksWithAuthors();
    List<Book> getBooksByAuthorId(Long authorId);

}
