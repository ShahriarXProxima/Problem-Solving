import java.util.Scanner;

public class StepanAndPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            int gcd = GCD(x, y);
            boolean isPossible = true;

            for (int i = 1; i <= n; i++) {
                int num = input.nextInt();

                if (i % gcd != num % gcd) {
                    isPossible = false;
                }
            }

            System.out.println(isPossible ? "YES" : "NO");

        }
    }

    public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}
