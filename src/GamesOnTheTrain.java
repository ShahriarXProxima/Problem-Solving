import java.util.Scanner;

public class GamesOnTheTrain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int maxH = Integer.MIN_VALUE;
            int minH = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int h = input.nextInt();
                maxH = Math.max(h, maxH);
                minH = Math.min(minH, h);
            }

            int minK = maxH - minH + 1;
            System.out.println(minK);
        }
    }
}
