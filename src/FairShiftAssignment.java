import java.util.Scanner;

public class FairShiftAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), k = input.nextInt();
        long[] arr = new long[n];
        long low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLong();

            if (arr[i] > low) {
                low = arr[i];
            }
            high += arr[i];
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            int man = 1;
            long currentLoad = 0;

            for (int i = 0; i < n; i++) {
                if (currentLoad + arr[i] <= mid) {
                    currentLoad += arr[i];
                } else {
                    man++;
                    currentLoad = arr[i];
                }
            }

            if (man <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}
