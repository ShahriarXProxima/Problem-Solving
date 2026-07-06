import java.util.Scanner;

public class Lever {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = input.nextInt();
            }

            int lever = lever(a, b);
            System.out.println(lever);

        }
    }

    public static int lever(int[] a, int[] b) {
        int ans = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                ans += a[i] - b[i];
            }
        }

        return ans + 1;
    }
}
