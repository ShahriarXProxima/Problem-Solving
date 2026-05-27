import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int time1 = a - 1;
            int time2 = Math.abs(b - c) + (c - 1);

            if (time1 < time2) {
                System.out.println(1);
            } else if (time1 > time2) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}