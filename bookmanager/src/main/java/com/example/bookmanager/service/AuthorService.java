package com.example.bookmanager.service;
/*TANISHQ VIJAY VAIDYA2023EBCS016*/
import com.example.bookmanager.model.Author;
import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();
    Author getAuthorById(Long id);
    Author saveAuthor(Author author);
    Author updateAuthor(Long id, Author author);
    void deleteAuthor(Long id);
    List<Author> getAllAuthorsWithBooks();
}