import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long k = input.nextLong();

        Map<Long, Integer> days = new HashMap<>();
        days.put(0L, 1);

        long sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            long val = input.nextLong();
            sum += val;

            long sumNeeded = sum - k;
            if (days.containsKey(sumNeeded)) {
                count += days.get(sumNeeded);
            }

            if (days.containsKey(sum)) {
                days.put(sum, days.get(sum) + 1);
            } else {
                days.put(sum, 1);
            }
        }
        System.out.println(count);
    }
}
