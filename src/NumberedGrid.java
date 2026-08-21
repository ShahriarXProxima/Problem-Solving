import java.util.Scanner;

public class NumberedGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (long) i * n + i + 1;
            sum += (long) i * n + (n - i);
        }

        if (n % 2 == 1) {
            sum -= (long) (n / 2) * n + (n / 2) + 1;
        }

        System.out.println(sum);
    }
}
