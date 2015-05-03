package ec.juanultimate.refactoring.extractmethod.before;

/**
 * Created by JuanGabriel on 21/04/2015.
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}