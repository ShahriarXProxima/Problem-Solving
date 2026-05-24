import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int num = input.nextInt();
            int count = 0;
            int power = 1;

            while (power <= num) {
                for (int digit = 1; digit <= 9; digit++) {
                    if ((long) digit * power <= num) {
                        count++;
                    }
                }
                power *= 10;
            }

            System.out.println(count);
        }
    }
}