package ec.juanultimate.refactoring.extractmethod;

import ec.juanultimate.refactoring.extractmethod.after.Customer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class CustomerTest {


    @Test
    public void mustExistCustomer(){
        Customer customer = new Customer("Juan Gabriel");
        Assert.assertNotNull(customer);
    }


    @Test
    public void mustGetName(){
        Customer customer = new Customer("Juan Gabriel");
        Assert.assertEquals(customer.getName(),"Juan Gabriel");
    }

}
