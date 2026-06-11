import java.util.Arrays;
import java.util.Scanner;

public class PrefixMax {
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
            System.out.println(arr[arr.length - 1] * n);
        }
    }
}
