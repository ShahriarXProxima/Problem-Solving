import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            double b = input.nextInt();

            double minimumCost = 0.0;
            if ((b / 2) < a) {
                if (n % 2 == 0) {
                    minimumCost = n * (b / 2);
                } else {
                    minimumCost = (n - 1) * (b / 2) + a;
                }
            } else {
                minimumCost = n * a;
            }

            System.out.println((int) minimumCost);
        }
    }
}
