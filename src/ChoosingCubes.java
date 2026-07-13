import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChoosingCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int f = input.nextInt();
            int k = input.nextInt();

            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            int val = a[f - 1];

            Arrays.sort(a, Collections.reverseOrder());

            if (a[k - 1] < val) {
                System.out.println("YES");
            } else if (a[k - 1] > val) {
                System.out.println("NO");
            } else {
                if (k < n && a[k] == val) {
                    System.out.println("MAYBE");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
