import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int sum1 = (int) Math.pow(2, n);
            int sum2 = 0;

            for (int i = 1; i < n / 2; i++) {
                sum1 += (int) Math.pow(2, i);
            }

            for (int i = n / 2; i < n; i++) {
                sum2 += (int) Math.pow(2, i);
            }

            System.out.println(Math.abs(sum1 - sum2));
        }
    }
}
