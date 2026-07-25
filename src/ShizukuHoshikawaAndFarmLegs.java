import java.util.Scanner;

public class ShizukuHoshikawaAndFarmLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            if (n % 2 == 1) {
                System.out.println(0);
                continue;
            }

            System.out.println((int) (n / 4) + 1);
        }
    }
}
