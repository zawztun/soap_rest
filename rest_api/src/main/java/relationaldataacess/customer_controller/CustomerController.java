package relationaldataacess.customer_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import relationaldataacess.utils.Customer;
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

   @GetMapping("/customers")
    public @ResponseBody Iterable<Customer> customers(){
       Iterable<Customer> list = repository.findAll();
       for(Customer customer : list){
      System.out.println(customer);
       }
       return repository.findAll();
   }

 @GetMapping("/add")
    public @ResponseBody Iterable<Customer> add(
       @RequestParam(value ="firstName",defaultValue = "MIKE") String firstName,
       @RequestParam(value = "lastName",defaultValue ="TOM" )String lastName){
       Customer  customer = new Customer(firstName,lastName);
       repository.save(customer);
       return repository.findAll();
       }

}

