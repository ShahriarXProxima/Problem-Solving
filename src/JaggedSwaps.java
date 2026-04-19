import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] permutation = new int[n];

            for (int i = 0; i < n; i++) {
                permutation[i] = input.nextInt();
            }

            boolean canPerformOperation = true;
            while (!isSorted(permutation) && canPerformOperation) {
                canPerformOperation = false;
                for (int i = 1; i < n - 1; i++) {
                    if (permutation[i - 1] < permutation[i] && permutation[i] > permutation[i + 1]) {
                        int temp = permutation[i];
                        permutation[i] = permutation[i + 1];
                        permutation[i + 1] = temp;
                        canPerformOperation = true;
                        break;
                    }
                }
            }

            if (isSorted(permutation)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
