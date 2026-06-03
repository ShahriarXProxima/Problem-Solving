import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = input.nextInt();

        int distress = 0;
        for (int i = 0; i < n; i++) {
            char sign = input.next().charAt(0);
            int iceCream = input.nextInt();

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
