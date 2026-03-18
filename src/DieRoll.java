import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Y = input.nextInt(), W = input.nextInt();
        int m = Math.max(Y, W);

        int favorable = 7 - m;
        if (favorable < 0) {
            favorable = 0;
        }

        int a = favorable, b = 6;
        int g = gcd(a, b);

        System.out.print((a / g) + "/" + (b / g));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
