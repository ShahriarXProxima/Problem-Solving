import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long minCandy = Integer.MAX_VALUE;
            long minORange = Integer.MAX_VALUE;

            int n = input.nextInt();
            long[] candy = new long[n];
            long[] orange = new long[n];

            for (int i = 0; i < n; i++) {
                candy[i] = input.nextInt();
                minCandy = Math.min(minCandy, candy[i]);
            }
            for (int i = 0; i < n; i++) {
                orange[i] = input.nextInt();
                minORange = Math.min(minORange, orange[i]);
            }

            long totalMoves = 0;
            for (int i = 0; i < n; i++) {
                long deltaCandy = candy[i] - minCandy;
                long deltaOrange = orange[i] - minORange;

                totalMoves += Math.max(deltaCandy, deltaOrange);
            }
            System.out.println(totalMoves);
        }
    }
}
