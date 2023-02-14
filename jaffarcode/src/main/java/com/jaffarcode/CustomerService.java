package com.jaffarcode;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    @Autowired
    static Map<Integer, Customer> customers = new HashMap<>();
    //static List<Customer> customers = new ArrayList<>();
    static Integer index = 2;
    static {
        Customer c1 = new Customer(1, "Jaffar", "abbasjaffar@gmail.com", 21);
        Customer c2 = new Customer(2, "Subhan", "subhan@gmail.com", 21);
        customers.put(1, c1);
        customers.put(2, c2);
//        customers.add(c1);
//        customers.add(c2);
    }
    public static List<Customer> getAllCustomers(){
        return new ArrayList<>(customers.values());
//        return customers;
    }

    public static Customer getCustomerDetails(Integer id){
        return customers.get(id);
    }

    public static Customer addCustomer(Customer customer){
        index += 1;
        customer.setId(index);
        //customers.add(index, customer);
        customers.put(index, customer);
        return customer;
    }

    public static Customer updateCustomer(Integer id, Customer customer){
        customer.setId(id);
        //customers.add(id, customer);
        customers.put(id, customer);
        return customer;
    }

    public static Customer deleteCustomer(Integer id){
//        Customer c = customers.get(id);
//        customers.remove(id);
        return customers.remove(id);
    }
}
