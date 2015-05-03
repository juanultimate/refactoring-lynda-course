package ec.juanultimate.refactoring.extractmethodwithparams;

import ec.juanultimate.refactoring.extractmethodwithparams.after.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class ItemTest {

    @Test
    public void mustExistItem(){
        Item item = new Item();
        Assert.assertNotNull(item);
    }

    @Test
    public void mustHavePrice(){
        Item item = new Item();
        Assert.assertNotNull(item.getPrice());
    }
}
