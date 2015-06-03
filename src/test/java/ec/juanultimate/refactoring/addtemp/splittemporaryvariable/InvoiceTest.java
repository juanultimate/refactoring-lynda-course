package ec.juanultimate.refactoring.addtemp.splittemporaryvariable;

import ec.juanultimate.refactoring.addtemp.splittemporaryvariable.before.Invoice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JuanGabriel on 02/06/2015.
 */
public class InvoiceTest {
    private Invoice invoice;
    @Before
    public void prepareInvoice(){
        invoice = new Invoice();
    }

    @Test
    public void mustPrintInvoiceInfo(){
        invoice.printInfo();

    }

}
