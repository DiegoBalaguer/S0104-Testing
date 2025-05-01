package level01.exercise02.model;

import java.util.List;

/**
 * PROGRAM: Dni
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Dni {

    private static final List<String> LETTERS_DNI = List.of(
            "T", "R", "W", "A", "G", "M", "Y", "F", "P",
            "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
            "H", "L", "C", "K", "E"
    );

    public static boolean isCorrectDNI(String dni) {
        return getLetterDni(dni).equalsIgnoreCase(calculateLetterDNI(dni));
    }

    public static String calculateLetterDNI(String dni) {
        return LETTERS_DNI.get(getNumberDni(dni) % 23);
    }

    public static int getNumberDni(String dni) {
        return Integer.parseInt((String) dni.subSequence(0, dni.length() - 1));
    }

    public static String getLetterDni(String dni) {
        return String.valueOf(dni.charAt(dni.length() - 1));
    }
}
