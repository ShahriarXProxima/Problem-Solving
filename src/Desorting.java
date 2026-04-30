import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = input.nextLong();
            }

            if (!isSorted(arr)) {
                System.out.println(0);
            } else {
                long ans = Long.MAX_VALUE;
                for (int i = 1; i <= n - 1; i++) {
                    long d = arr[i] - arr[i + 1];
                    long ops = (1 - d + 1) / 2;

                    ans = Math.min(ans, ops);
                }
                System.out.println(ans);
            }

        }
    }

    static boolean isSorted(long[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
