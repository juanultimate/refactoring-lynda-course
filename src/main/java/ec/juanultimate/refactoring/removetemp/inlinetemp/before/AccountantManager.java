package ec.juanultimate.refactoring.removetemp.inlinetemp.before;

/**
 * Created by JuanGabriel on 02/06/2015.
 */
public class AccountantManager {

    private double balance;
    private double pendingCharges;

    public AccountantManager(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean checkWithdrawalStatus(double amountToWithdraw) {
        //create temp
        double temp = availableBalance();
        //use temp
        if(temp >= amountToWithdraw){
            System.out.println("Aprroved!");
            return true;
        }
        else{
            System.out.println("You only have " + temp + " available.");
            return false;
        }

    }

    public double availableBalance() {
        return balance - pendingCharges;
    }
}