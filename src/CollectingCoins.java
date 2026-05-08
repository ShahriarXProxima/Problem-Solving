import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int totalCoins = 0;
            int[] coins = new int[4];
            for (int i = 0; i < 4; i++) {
                coins[i] = input.nextInt();
                totalCoins += coins[i];
            }

            int max = Math.max(coins[0], Math.max(coins[2], coins[1]));
            if (totalCoins % 3 == 0 && totalCoins / 3 >= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}