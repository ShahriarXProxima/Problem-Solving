import java.util.Scanner;

public class GregorAndCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int p = input.nextInt();
            if (p == 5) {
                System.out.println(2 + " " + 4);
                continue;
            }
            int a = 2;
            int b = p / a;

            System.out.println(a + " " + b);
        }
    }
}
