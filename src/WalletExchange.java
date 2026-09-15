import java.util.Scanner;

public class WalletExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt(), b = input.nextInt();

            if ((a % 2) != (b % 2)) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
