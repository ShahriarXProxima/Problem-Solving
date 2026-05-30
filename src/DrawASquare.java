import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DrawASquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            Set<Integer> points = new HashSet<>();
            for (int i = 1; i <= 4; i++) {
                points.add(input.nextInt());
            }

            if (points.size() == 1) {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
