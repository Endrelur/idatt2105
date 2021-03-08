package ntnu.idatt2105.endretorstein.springtjener.service.interfaces;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;
import ntnu.idatt2105.endretorstein.springtjener.model.Author;
import ntnu.idatt2105.endretorstein.springtjener.model.Book;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthors();

    Author getAuthor(Integer id);

    List<Book> getAuthorBooks(Integer authorId);

    void saveBookToAuthor(Integer authorId, Integer bookId);

    void deleteAuthorsBook(Integer authorId, Integer bookId);

    Address getAuthorAddress(Integer authorId);

    void setAuthorAddress(Integer authorId, Integer addressId);

    void deleteAuthorAddress(Integer authorId, Integer addressId);

    void deleteAuthor(Integer authorId);

    void saveAuthor(Author author);


}
