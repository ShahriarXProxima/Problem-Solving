import java.util.Scanner;

public class MaximumMultipleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            if (n == 3) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }

        }
    }
}
