import java.util.Scanner;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int bestQuality = -1;
            int winner = -1;

            for (int i = 1; i <= n; i++) {
                int a = input.nextInt();
                int b = input.nextInt();

                if (a <= 10 && b > bestQuality) {
                    bestQuality = b;
                    winner = i;
                }
            }
            System.out.println(winner);
        }
    }
}
