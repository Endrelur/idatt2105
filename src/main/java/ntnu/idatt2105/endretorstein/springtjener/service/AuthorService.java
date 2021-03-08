package ntnu.idatt2105.endretorstein.springtjener.service;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;
import ntnu.idatt2105.endretorstein.springtjener.model.Author;
import ntnu.idatt2105.endretorstein.springtjener.model.Book;
import ntnu.idatt2105.endretorstein.springtjener.repo.AuthorRepo;
import ntnu.idatt2105.endretorstein.springtjener.service.interfaces.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorService implements IAuthorService {

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Author getAuthor(Integer id) {
        return null;
    }

    @Override
    public List<Book> getAuthorBooks(Integer authorId) {
        return null;
    }

    @Override
    public void saveBookToAuthor(Integer authorId, Integer bookId) {

    }

    @Override
    public void deleteAuthorsBook(Integer authorId, Integer bookId) {

    }

    @Override
    public Address getAuthorAddress(Integer authorId) {
        return null;
    }

    @Override
    public void setAuthorAddress(Integer authorId, Integer addressId) {

    }

    @Override
    public void deleteAuthorAddress(Integer authorId, Integer addressId) {

    }

    @Override
    public void deleteAuthor(Integer authorId) {

    }

    @Override
    public void saveAuthor(Author author) {

    }
}
