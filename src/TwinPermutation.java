import java.util.Scanner;

public class TwinPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print((n + 1 - arr[i]) + " ");
            }
            System.out.println();
        }
    }
}