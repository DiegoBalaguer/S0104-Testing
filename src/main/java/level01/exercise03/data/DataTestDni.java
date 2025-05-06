package level01.exercise03.data;

import java.util.List;

/**
 * PROGRAM: DataTestDni
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DataTestDni {
    private static final List<String> DNI_TEST = List.of(
            "38153776L",
            "38894167V",
            "38894167Z",
            "38539583R",
            "38868921W",
            "38868921Z",
            "38658189L",
            "38849352Y",
            "38849352Z",
            "38218825R");

    public static List<String> getDniTest() {
        return DNI_TEST;
    }

    public String getDniTestByIndex(int index) {

        return DNI_TEST.get(index);
    }
}
