package com.jaffarcode;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CustomerController {
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return CustomerService.getAllCustomers();
    }
    @GetMapping("/customers/{id}")
    public Customer getCustomerDetails(@PathVariable Integer id){
        return CustomerService.getCustomerDetails(id);
    }
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return CustomerService.addCustomer(customer);
    }
    @PutMapping("/updateCustomer/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        return CustomerService.updateCustomer(id, customer);
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public Customer deleteCustomer(@PathVariable Integer id){
        return CustomerService.deleteCustomer(id);
    }
}
