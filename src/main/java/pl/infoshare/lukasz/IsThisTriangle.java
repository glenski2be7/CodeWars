package pl.infoshare.lukasz;

public class IsThisTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            return true;
        } else return false;
    }
}
