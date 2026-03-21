import java.util.Arrays;
import java.util.Scanner;

public class FlipFlops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] <= c) {
                    long flops = Math.min(k, c - a[i]);
                    k -= flops;
                    a[i] += flops;
                    c += a[i];
                } else {
                    break;
                }
            }

            System.out.println(c);
        }
    }
}
