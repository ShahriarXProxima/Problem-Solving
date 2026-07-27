import java.util.Arrays;
import java.util.Scanner;

public class SashaAndArrayColoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);

            int ans = 0;
            for (int i = 0; i < n / 2; i++) {
                ans += arr[n - 1 - i] - arr[i];
            }
            System.out.println(ans);
        }
    }
}
