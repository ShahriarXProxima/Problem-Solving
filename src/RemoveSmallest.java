import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
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

            boolean isPossible = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] > 1) {
                    isPossible = true;
                    break;
                }
            }

            if (isPossible) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
