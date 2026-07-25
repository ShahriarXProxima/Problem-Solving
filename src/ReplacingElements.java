import java.util.Arrays;
import java.util.Scanner;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int d = input.nextInt();
            int[] arr = new int[n];

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] > d) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("YES");
                continue;
            }

            Arrays.sort(arr);
            int sum = arr[0] + arr[1];

            if (sum <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
