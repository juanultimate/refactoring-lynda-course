package ec.juanultimate.refactoring.removetemp.tempwithquery.before;

/**
 * Created by JuanGabriel on 02/06/2015.
 */
public class AccountantManager {

    private double balance;
    private double pendingCharges;

    public AccountantManager(double  initialBalance) {
        this.balance = initialBalance;
    }

    public boolean checkWithdrawalStatus(double amountToWithdraw) {
        //create temp
        double availableBalance = balance - pendingCharges;

        //use temp
        if(availableBalance >= amountToWithdraw){
            System.out.println("Aprroved!");
            return true;
        }
        else{
            System.out.println("You only have " +availableBalance + " available.");
            return false;
        }

    }
}