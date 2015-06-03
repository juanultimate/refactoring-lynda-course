package ec.juanultimate.refactoring.inlinemethod.before;

/**
 * Created by JuanGabriel on 01/06/2015.
 */
public class AreaCalculator {
    public static double calculateAreaOfCircle(double radio) {
        double area= getValueOfPi()*Math.pow(radio,2);
        return area;
    }

    private static double getValueOfPi() {
        return Math.PI;
    }
}

