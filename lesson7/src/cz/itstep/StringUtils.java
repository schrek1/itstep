package cz.itstep;

public class StringUtils {
    public static String replaceSpaces(String input) {
        if (input == null) return null;
        return input.replace(" ", "");
    }
}
