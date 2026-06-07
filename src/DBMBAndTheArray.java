import java.util.Scanner;

public class DBMBAndTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            int x = input.nextInt();

            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];
            }

            if (s >= sum && (s - sum) % x == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
