package ec.juanultimate.refactoring.extractmethodwithparams.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class Order {

    private Customer customer;
    private List<Item> items = new ArrayList<Item>();
    private double total;
    private double discount;

    public Order(Customer customer) {
        this.customer=customer;
    }
    public Customer getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}