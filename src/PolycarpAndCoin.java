import java.util.Scanner;

public class PolycarpAndCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int c1, c2;

            if (n % 3 == 0) {
                c1 = n / 3;
                c2 = n / 3;
            } else if (n % 3 == 1) {
                c1 = n / 3 + 1;
                c2 = n / 3;
            } else {
                c1 = n / 3;
                c2 = n / 3 + 1;
            }

            System.out.println(c1 + " " + c2);
        }
    }
}
