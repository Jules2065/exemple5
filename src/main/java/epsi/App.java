package epsi;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int result = compute(args);
        System.out.println("The result is : " + result);
    }

    public static int compute( String[] args) {
        return new CalculatorMulti().add(2, 5);
    }
}
