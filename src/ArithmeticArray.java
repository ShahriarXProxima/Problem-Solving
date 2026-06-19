import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += input.nextInt();
            }

            if (sum > n) {
                System.out.println(sum - n);
            } else if (sum == n) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
