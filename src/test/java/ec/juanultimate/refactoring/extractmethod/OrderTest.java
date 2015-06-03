package ec.juanultimate.refactoring.extractmethod;

import ec.juanultimate.refactoring.extractmethod.after.Customer;
import ec.juanultimate.refactoring.extractmethod.after.Order;
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


}
