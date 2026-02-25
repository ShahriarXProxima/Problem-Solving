import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        int a, b;

        while (test-- > 0) {
            a = input.nextInt();
            b = input.nextInt();
            int moves = (a % b == 0) ? 0 : b - (a % b);
            System.out.println(moves);
        }
    }
}
