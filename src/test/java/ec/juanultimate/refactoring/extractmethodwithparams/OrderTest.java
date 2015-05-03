package ec.juanultimate.refactoring.extractmethodwithparams;

import ec.juanultimate.refactoring.extractmethodwithparams.after.Customer;
import ec.juanultimate.refactoring.extractmethodwithparams.after.Order;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class OrderTest {
    @Test
    public void mustExistOrder(){
        Customer customer = new Customer("Juan Gabriel");
        Order order = new Order(customer);
        Assert.assertNotNull(order);
    }


    @Test
    public void orderMustHaveACustomer(){
        Customer customer = new Customer("Juan Gabriel");
        Order order = new Order(customer);
        Assert.assertNotNull(order.getCustomer());
    }

    @Test
       public void orderMustHaveItems(){
        Customer customer = new Customer("Juan Gabriel");
        Order order = new Order(customer);
        Assert.assertNotNull(order.getItems());
    }
}
