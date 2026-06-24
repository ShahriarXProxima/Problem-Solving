import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] digits = new int[n];

            for (int i = 0; i < n; i++) {
                digits[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int numMoves = input.nextInt();
                String movesSequence = input.next();

                for (int j = 0; j < numMoves; j++) {
                    char move = movesSequence.charAt(j);

                    if (move == 'U') {
                        digits[i] = (digits[i] - 1 + 10) % 10;
                    } else if (move == 'D') {
                        digits[i] = (digits[i] + 1) % 10;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(digits[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}