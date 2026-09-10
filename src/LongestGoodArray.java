import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long l = input.nextInt();
            long r = input.nextInt();

            long diff = r - l;
            System.out.println((long) ((Math.sqrt(1 + 8.0 * diff) - 1) / 2) + 1);
        }
    }
}
