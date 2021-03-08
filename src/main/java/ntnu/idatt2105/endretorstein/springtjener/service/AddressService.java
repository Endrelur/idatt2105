package ntnu.idatt2105.endretorstein.springtjener.service;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;
import ntnu.idatt2105.endretorstein.springtjener.repo.AddressRepo;
import ntnu.idatt2105.endretorstein.springtjener.service.interfaces.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> getAllAddresses() {
        return (List<Address>) this.addressRepo.findAll();
    }

    @Override
    public Address getAddress(Integer addressId) {
        return this.addressRepo.findById(addressId).orElseThrow();
    }

    @Override
    public void deleteAddress(Integer addressId) {
        this.addressRepo.deleteById(addressId);
    }

    @Override
    public void saveAddress(Address address) {
        this.addressRepo.save(address);
    }
}
