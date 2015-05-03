package ec.juanultimate.refactoring.extractmethod;

import ec.juanultimate.refactoring.extractmethod.after.Customer;
import ec.juanultimate.refactoring.extractmethod.after.Invoice;
import ec.juanultimate.refactoring.extractmethod.after.Order;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JuanGabriel on 20/04/2015.
 */

public class InvoiceTest {
    @Test
    public void mustExistInvoice(){
        Invoice invoice = new Invoice();
        Assert.assertNotNull(invoice);
    }



    @Test
    public void mustPrintInvoiceHeader(){
        Invoice invoice = new Invoice();
        Customer customer = new Customer("Juan Gabriel");
        Order order = new Order(customer);
        invoice.printInvoice(order);
    }


}
