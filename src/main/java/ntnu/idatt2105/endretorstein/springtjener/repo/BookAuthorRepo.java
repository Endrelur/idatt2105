package ntnu.idatt2105.endretorstein.springtjener.repo;

import model.BookAuthor;
import model.BookAuthorId;
import ntnu.idatt2105.endretorstein.springtjener.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookAuthorRepo extends CrudRepository<BookAuthor, BookAuthorId> {
    List<BookAuthor> findByAuthorId(Integer authorId);

    List<BookAuthor> fiByBookId(Integer bookId);
}
