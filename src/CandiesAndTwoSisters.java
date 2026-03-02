import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            int candies = input.nextInt();

            if (candies % 2 == 0) {
                System.out.println((candies / 2) - 1);
            } else {
                System.out.println((int) candies / 2);
            }
        }
    }
}
