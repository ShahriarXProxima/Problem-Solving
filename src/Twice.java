import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                arr[x]++;
            }

            int score = 0;
            for (int i = 1; i <= n; i++) {
                score += arr[i] / 2;
            }
            System.out.println(score);

        }
    }
}
