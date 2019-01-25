package pl.infoshare.lukasz.sql;

public class CalculateAverafgeFromArray {
    public static double find_average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / array.length;
    }
}
