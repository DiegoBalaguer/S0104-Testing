package level01.exercise03.data;

import java.util.List;

/**
 * PROGRAM: DataTestDni
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DataTestDni {

    private static final List<String> DNI_TEST = List.of(
            "38153776L", "38894167V", "38882316B", "38539583R",
            "38868921W", "38235523R", "38658189L", "38849352Y",
            "38543329K", "38218825R");

    public List<String> getDniTest() {
        return DNI_TEST;
    }

    public String getDniTestByIndex(int index) {

        return DNI_TEST.get(index);
    }
}
