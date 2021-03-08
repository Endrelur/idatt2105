package ntnu.idatt2105.endretorstein.springtjener.service.interfaces;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> getAllAddresses();

    Address getAddress(Integer addressId);

    void deleteAddress(Integer addressId);

    void saveAddress(Address address);
}
