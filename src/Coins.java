import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
           long n = input.nextLong();
           long k = input.nextLong();

            if (n % 2 == 0) {
                System.out.println("YES");
            } else if (k % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
