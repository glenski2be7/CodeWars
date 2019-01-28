package pl.infoshare.lukasz;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int half = word.length() / 2;
        if (word.length() % 2 == 0)
            return word.substring(half - 1, half + 1);
        else
            return word.substring(half, half + 1);
    }

}
