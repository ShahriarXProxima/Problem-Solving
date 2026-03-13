import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();

            int difference = Math.abs(a - b);
            int moves = (difference + 9) / 10;

            System.out.println(moves);
        }
    }
}
