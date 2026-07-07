import java.util.Scanner;

public class VasyaAndCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt(), b = input.nextInt();

            if (a == 0 && b > a) {
                System.out.println(1);
                continue;
            }

            int result = (a + 1) + (b * 2);
            System.out.println(result);
        }
    }
}
