import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long n = input.nextLong();
            int count = 0;

            for (int i = 1; i <= 9; i++) {
                long val = i;

                while (val <= n) {
                    count++;
                    val = val * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}
