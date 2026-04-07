import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int candyCount = 0;
            if (n == 1) {
                System.out.println(candyCount);
            } else {
                for (int i = 0; i < n; i++) {
                    if (arr[i] > min) {
                        candyCount += arr[i] - min;
                    }
                }
                System.out.println(candyCount);
            }
        }
    }
}