import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int num = input.nextInt();
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}
