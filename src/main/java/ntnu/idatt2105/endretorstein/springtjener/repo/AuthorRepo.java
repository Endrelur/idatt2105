package ntnu.idatt2105.endretorstein.springtjener.repo;

import ntnu.idatt2105.endretorstein.springtjener.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
