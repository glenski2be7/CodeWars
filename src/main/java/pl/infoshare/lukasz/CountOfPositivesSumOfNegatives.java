package pl.infoshare.lukasz;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null) { return new int[0];}
        if (input.length == 0) { return new int[0];}

        int positiveCount = 0;
        int sumOfNegatives = 0;
        int i = 0;

        for(i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                positiveCount++;
            }
            else {
                sumOfNegatives = sumOfNegatives + input[i];
            }
        }
        int[] input2 = {positiveCount, sumOfNegatives };
        return input2; //return an array with count of positives and sum of negatives
    }
}
