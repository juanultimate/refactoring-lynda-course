package ec.juanultimate.refactoring.extractmethodwithparams.after;

/**
 * Created by JuanGabriel on 22/04/2015.
 */
public class Item {
    private Double price=0D;
    private double quantity;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
