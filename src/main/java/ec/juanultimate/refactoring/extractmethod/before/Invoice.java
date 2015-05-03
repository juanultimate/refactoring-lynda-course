package ec.juanultimate.refactoring.extractmethod.before;

/**
 * Created by JuanGabriel on 20/04/2015.
 */
public class Invoice {
    public void printInvoice(Order order) {
        //print invoice header
        System.out.println("Invoice");
        System.out.println("=====================");
        System.out.println();

        //print customer details
        System.out.println("Customer:");
        System.out.println("  "+order.getCustomer().getName());
        System.out.println();

        //print address details
        //... order item details
        //... footer, etc

    }
}
