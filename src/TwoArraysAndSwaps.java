import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = input.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = 0, j = n - 1; k > 0; i++, j--) {
                if (a[i] < b[j]) {
                    a[i] = b[j];
                }
                k--;
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }

            System.out.println(sum);
        }
    }
}
