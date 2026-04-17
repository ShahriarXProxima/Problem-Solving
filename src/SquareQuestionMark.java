import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SquareQuestionMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            Set<Integer> squareSet = new HashSet<>();

            for (int i = 0; i < 4; i++) {
                squareSet.add(input.nextInt());
            }

            if (squareSet.size() == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
