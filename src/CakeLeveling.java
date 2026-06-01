import java.util.Scanner;

public class CakeLeveling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int n = input.nextInt();

            long prefixSum = 0;
            long minHeight = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                prefixSum += input.nextLong();

                minHeight = Math.min(minHeight, prefixSum / i);

                System.out.print(minHeight);
                if (i < n) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
