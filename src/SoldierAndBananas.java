import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = input.nextInt();
        long dollar = input.nextLong();
        int banana = input.nextInt();
        long totalPrice = 0;

        for (int i = 1; i <= banana; i++) {
            int calc = price * i;
            totalPrice += calc;
        }
        if (totalPrice - dollar < 0) {
            System.out.print(0);
        } else {
            System.out.print(totalPrice - dollar);
        }
    }
}
