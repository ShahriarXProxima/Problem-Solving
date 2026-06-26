import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] stones = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                stones[i] = input.nextInt();
                min = Math.min(min, stones[i]);
                max = Math.max(max, stones[i]);
            }

            int movesMinLeft = 0, movesMinRight = 0;
            int i = 0, j = n - 1;
            while (stones[i] != min) {
                i++;
                movesMinLeft++;
            }
            movesMinLeft++;
            while (stones[j] != min) {
                j--;
                movesMinRight++;
            }
            movesMinRight++;

            int movesMaxLeft = 0, movesMaxRight = 0;
            int k = 0, l = n - 1;
            while (stones[k] != max) {
                k++;
                movesMaxLeft++;
            }
            movesMaxLeft++;
            while (stones[l] != max) {
                l--;
                movesMaxRight++;
            }
            movesMaxRight++;

            int bothLeft = Math.max(movesMinLeft, movesMaxLeft);
            int bothRight = Math.max(movesMinRight, movesMaxRight);
            int split1 = movesMinLeft + movesMaxRight;
            int split2 = movesMinRight + movesMaxLeft;

            System.out.println(Math.min(bothLeft, Math.min(bothRight, Math.min(split1, split2))));
        }
    }
}
