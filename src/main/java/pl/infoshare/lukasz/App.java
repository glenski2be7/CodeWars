package pl.infoshare.lukasz;

import pl.infoshare.lukasz.sql.CalculateAverafgeFromArray;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(ReturnNegative.makeNegative(-8));
        System.out.println(FindTheSmallestIntegerInTheArray.findSmallestInt(new int[]{3, 5, 1}));
        System.out.println(BasicVariableAssignment.name);

        System.out.println(JennysSecretMessage.greet("Johnny"));
        System.out.println(JennysSecretMessage.greet("Eddy"));

        System.out.println("Srednia: " + CalculateAverafgeFromArray.find_average(new int[]{1, 2}));
    }
}
