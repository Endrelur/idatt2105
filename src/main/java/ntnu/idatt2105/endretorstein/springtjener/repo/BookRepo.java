package ntnu.idatt2105.endretorstein.springtjener.repo;

import ntnu.idatt2105.endretorstein.springtjener.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
