import java.util.Scanner;

public class DifferentDistances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            int[] arr = construct(n);
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    static int[] construct(int n) {
        int[] arr = new int[4 * n];

        for (int i = 1; i <= n; i++) {
            int p1 = i - 1;
            int p2 = n + i - 1;
            int p3 = 2 * n + (i % n);
            int p4 = 3 * n + i - 1;

            arr[p1] = i;
            arr[p2] = i;
            arr[p3] = i;
            arr[p4] = i;
        }
        return arr;
    }
}
