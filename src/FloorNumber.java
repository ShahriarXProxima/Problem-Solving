import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();

            if (n <= 2) {
                System.out.println(1);
            } else {
                System.out.println(2 + (n - 3) / x);
            }

        }
    }
}
