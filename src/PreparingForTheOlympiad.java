import java.util.Scanner;

public class PreparingForTheOlympiad {
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

            int maxDiff = a[n - 1];
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > b[i + 1]) {
                    maxDiff += a[i] - b[i + 1];
                }
            }

            System.out.println(maxDiff);
        }
    }
}
