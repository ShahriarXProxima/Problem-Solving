import java.util.Scanner;

public class HardProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int m = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int row1 = 0;
            int row2 = 0;

            if (m >= a) {
                row1 += a;
            } else {
                row1 = m;
            }

            if (m >= b) {
                row2 += b;
            } else {
                row2 = m;
            }

            int seatOccupied = row1 + row2;
            int seatRemaining = (2 * m) - seatOccupied;

            seatOccupied += Math.min(seatRemaining, c);
            System.out.println(seatOccupied);
        }
    }
}
