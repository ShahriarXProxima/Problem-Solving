import java.util.Arrays;
import java.util.Scanner;

public class GoodKid {
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
            arr[0] = arr[0] + 1;

            Long product = 1L;
            for (int i = 0; i < n; i++) {
                product *= arr[i];
            }

            System.out.println(product);

        }
    }
}
