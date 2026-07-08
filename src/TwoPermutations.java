import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();

            if ((a == n && b == n) || a + b <= n - 2) {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
