package pl.infoshare.lukasz;

class RemoveExclamationMarks {
    public static String removeExclamationMarks(String text) {
        text = text.replace("!", "");
        return text;
    }
}
