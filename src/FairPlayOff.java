import java.util.Scanner;

public class FairPlayOff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] player = new int[4];

            for (int i = 0; i < 4; i++) {
                player[i] = input.nextInt();
            }

            int winner1 = Math.max(player[0], player[1]);
            int winner2 = Math.max(player[2], player[3]);

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int skill : player) {
                if (skill > max1) {
                    max2 = max1;
                    max1 = skill;
                } else if (skill > max2) {
                    max2 = skill;
                }
            }

            if ((winner1 == max1 && winner2 == max2) || (winner1 == max2 && winner2 == max1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
