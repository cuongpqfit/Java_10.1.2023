package Lesson3;
import java.util.Objects;
public class Bai7 {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int output = 0;
        if (operations.length == 0) {
            return 0;
        } else {
            for (String operation : operations) {
                if (Objects.equals(operation, "X++") || Objects.equals(operation, "++X")) {
                    output += 1;
                }
                if (Objects.equals(operation, "X--") || Objects.equals(operation, "--X")) {
                    output -= 1;
                }
            }
            return output;
        }
    }
}
