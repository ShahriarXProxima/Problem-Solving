import java.util.Scanner;

public class TurtlePuzzleRearrangeAndNegate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            double sum = 0;
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                sum += Math.abs(input.nextDouble());
            }
            System.out.println((int) sum);
        }
    }
}
