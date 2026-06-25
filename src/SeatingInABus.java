import java.util.Scanner;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] seats = new int[n];
            for (int i = 0; i < n; i++) {
                seats[i] = input.nextInt();
            }

            int max = seats[0];
            int min = seats[0];
            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (seats[i] == min - 1) {
                    min = seats[i];
                } else if (seats[i] == max + 1) {
                    max = seats[i];
                } else {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
    }
}
