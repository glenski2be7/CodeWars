package pl.infoshare.lukasz;

public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {

        str = str.substring(1); // index starts at zero String
        str = str.substring(0, str.length() - 1);

        return str;
    }
}
