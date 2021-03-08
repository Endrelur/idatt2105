package ntnu.idatt2105.endretorstein.springtjener.controller;

import ntnu.idatt2105.endretorstein.springtjener.model.Address;
import ntnu.idatt2105.endretorstein.springtjener.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public List<Address> getAll() {
        return this.addressService.getAllAddresses();
    }

    @GetMapping("/addresses/{id}")
    public Address getAddress(@PathVariable int id) {
        return this.addressService.getAddress(id);
    }

    @DeleteMapping("/addresses/{id}")
    public void deleteAddress(@PathVariable int id) {
        this.addressService.deleteAddress(id);
    }

    @PostMapping("/addresses")
    public void saveAddress(@RequestBody Address address) {
        this.addressService.saveAddress(address);
    }

    @GetMapping("/test/{id}")
    public String aTest(@PathVariable int id) {
        return "you typed in " + id + ", as path-variable";
    }

}
