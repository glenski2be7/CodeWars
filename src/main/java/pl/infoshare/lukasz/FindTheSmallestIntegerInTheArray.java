package pl.infoshare.lukasz;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        // for each loop
        for (int num : args) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
