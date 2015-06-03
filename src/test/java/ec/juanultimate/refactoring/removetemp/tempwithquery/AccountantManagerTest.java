package ec.juanultimate.refactoring.removetemp.tempwithquery;


import ec.juanultimate.refactoring.removetemp.tempwithquery.after.AccountantManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JuanGabriel on 02/06/2015.
 */
public class AccountantManagerTest {
    private AccountantManager manager;
    @Test
    public void ifWithdrawalIsGreaterThanBalanceReturnFalse(){
        Assert.assertFalse(manager.checkWithdrawalStatus(101d));
    }

    @Test
    public void ifWithdrawalIsLessThanBalanceReturnTrue(){
       Assert.assertTrue(manager.checkWithdrawalStatus(99d));
    }

    @Test
    public void ifWithdrawalIsEqualsBalanceReturnTrue(){
        Assert.assertTrue(manager.checkWithdrawalStatus(100d));
    }


    @Before
    public void prepareAccountantManager() {
        manager =  new AccountantManager(100d);
    }


}
