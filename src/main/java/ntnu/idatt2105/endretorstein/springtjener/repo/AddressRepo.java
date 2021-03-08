package ntnu.idatt2105.endretorstein.springtjener.repo;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
}
