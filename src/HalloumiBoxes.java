import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int[] arr = new int[n];
            boolean isSorted = true;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (i > 0 && arr[i] < arr[i - 1]) {
                    isSorted = false;
                }
            }

            if (k >= 2 || isSorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
