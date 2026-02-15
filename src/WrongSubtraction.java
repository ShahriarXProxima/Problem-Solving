import java.util.Scanner;

public class WrongSubtraction {
    static long lastDigit(long num) {
        return num % 10;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextInt(), k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (lastDigit(num) == 0) {
                num /= 10;
            } else {
                num -= 1;
            }
        }
        System.out.print(num);

    }
}
