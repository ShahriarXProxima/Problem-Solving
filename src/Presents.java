import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (input.hasNext()) {
            int n = input.nextInt();
            int[] giftGivers = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                int p = input.nextInt();
                giftGivers[p] = i;
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(giftGivers[i] + " ");
            }
        }
    }
}
