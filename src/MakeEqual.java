import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }

            long avg = sum / n;

            long prefix = 0;
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                prefix += arr[i];
                if (prefix < (long) (i + 1) * avg) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
