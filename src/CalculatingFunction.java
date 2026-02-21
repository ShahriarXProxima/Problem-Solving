import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        long result = 0;

        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }
        System.out.print(result);
    }
}
