import java.util.Scanner;

public class RelaySignals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), k = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        long sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");

            int removeIdx = i + 1;
            int addIdx = i + k + 1;

            if (removeIdx >= n) {
                removeIdx -= n;
            }

            if (addIdx >= n) {
                addIdx -= n;
            }
            sum -= arr[removeIdx];
            sum += arr[addIdx];
        }
    }
}
