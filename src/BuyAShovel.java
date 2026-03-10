import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int r = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int lastDigit = (i * k) % 10;
            if (lastDigit == 0 || lastDigit == r) {
                System.out.print(i);
                break;
            }
        }
    }
}
