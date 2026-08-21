import java.util.Scanner;

public class BestWinningStreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long sum = 0;
        long smallestPrefix = 0;
        long best = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            long value = input.nextLong();
            sum += value;
            long current = sum - smallestPrefix;

            if (current > best) {
                best = current;
            }

            if (sum < smallestPrefix) {
                smallestPrefix = sum;
            }
        }

        System.out.println(best);
    }
}
