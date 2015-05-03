package ec.juanultimate.refactoring.extractmethod.after;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class Order {

    Customer customer;

    public Order(Customer customer) {
        this.customer=customer;
    }


    public Customer getCustomer() {
        return customer;
    }
}