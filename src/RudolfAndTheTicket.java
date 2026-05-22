import java.util.Scanner;

public class RudolfAndTheTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();

            int[] left = new int[n];
            int[] right = new int[m];

            for (int i = 0; i < n; i++) {
                left[i] = input.nextInt();
            }
            for (int i = 0; i < m; i++) {
                right[i] = input.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (left[i] + right[j] <= k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
