package relationaldataacess.customer_controller;


import org.springframework.data.repository.CrudRepository;
import relationaldataacess.utils.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
