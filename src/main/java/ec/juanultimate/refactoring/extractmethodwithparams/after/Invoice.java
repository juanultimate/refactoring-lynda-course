package ec.juanultimate.refactoring.extractmethodwithparams.after;

import lombok.extern.java.Log;

import java.util.List;

/**
 * Created by JuanGabriel on 20/04/2015.
 */
@Log
public class Invoice {
    public void printInvoice(Order order) {
        double totalAmount =0.0;
        //print invoice header
        printInvoiceHeader();
        printCustomerDetails(order.getCustomer());
        printOrderTotal(order);


        //print address details
        //... order item details
        //... footer, etc

    }

    private void printOrderTotal(Order order) {
        double totalAmount = 0.0;
        List<Item> items = order.getItems();
        for(Item item : items){
            totalAmount = totalAmount + item.getPrice();
        }
        System.out.println("Amount:"+totalAmount);
    }

    private void printCustomerDetails(Customer customer) {
        //print customer details
        System.out.println("Customer:");
        System.out.println("  "+customer.getName());
        System.out.println();

    }

    private void printInvoiceHeader() {
        System.out.println("Invoice");
        System.out.println("=====================");
        System.out.println();
    }
}
