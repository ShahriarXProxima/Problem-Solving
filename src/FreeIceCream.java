import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long x = input.nextLong();

        int distress = 0;
        for (int i = 0; i < n; i++) {
            char sign = input.next().charAt(0);
            long iceCream = input.nextLong();

            if (sign == '+') {
                x += iceCream;
                continue;
            } else if (sign == '-' && x >= iceCream) {
                x -= iceCream;
                continue;
            }
            distress++;
        }

        System.out.println(x + " " + distress);
    }
}
