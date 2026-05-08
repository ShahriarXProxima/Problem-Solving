import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] athletes = new int[n];

            for (int i = 0; i < n; i++) {
                athletes[i] = input.nextInt();
            }
            Arrays.sort(athletes);

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                int differ = athletes[i + 1] - athletes[i];
                ans = Math.min(ans, differ);
            }

            System.out.println(ans);
        }
    }
}
