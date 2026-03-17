import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int[] gasStation = new int[n];

            for (int i = 0; i < n; i++) {
                gasStation[i] = input.nextInt();
            }

            int maxGap = 0;
            maxGap = Math.max(maxGap, gasStation[0]);

            for (int i = 1; i < n; i++) {
                maxGap = Math.max(maxGap, gasStation[i] - gasStation[i - 1]);
            }

            maxGap = Math.max(maxGap, 2 * (x - gasStation[n - 1]));

            System.out.println(maxGap);
        }
    }
}
