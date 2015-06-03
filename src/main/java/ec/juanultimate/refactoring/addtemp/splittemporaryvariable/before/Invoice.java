package ec.juanultimate.refactoring.addtemp.splittemporaryvariable.before;

import ec.juanultimate.refactoring.extractmethodwithparams.after.Item;
import ec.juanultimate.refactoring.extractmethodwithparams.before.Customer;
import ec.juanultimate.refactoring.extractmethodwithparams.before.Order;

/**
 * Created by JuanGabriel on 02/06/2015.
 */
public class Invoice {
    Item item = new Item();
    Order order = new Order(new Customer("Juan Gabriel"));
    public void printInfo() {
        //create temp
        double t = item.getPrice()*item.getQuantity();
        System.out.println("Line total:"+t);

        //later
        t= order.getTotal()  - order.getDiscount();
        System.out.println("Amount due: "+ t);
    }
}
