import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int totalCoins = 0;
            for (int i = 1; i <= 4; i++) {
                totalCoins += input.nextInt();
            }

            if (totalCoins % 3 == 0) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}

