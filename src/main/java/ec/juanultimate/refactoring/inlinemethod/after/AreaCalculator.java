package ec.juanultimate.refactoring.inlinemethod.after;

/**
 * Created by JuanGabriel on 01/06/2015.
 */
public class AreaCalculator {
    public static double calculateAreaOfCircle(double radio) {
        double area= Math.PI *Math.pow(radio,2);
        return area;
    }

}

