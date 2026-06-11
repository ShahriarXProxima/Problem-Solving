import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            long n = input.nextLong();
            long s = input.nextLong();
            long m = input.nextLong();


            boolean canShower = false;
            int previous_r = 0;

            while (n-- > 0) {
                int l = input.nextInt();
                int r = input.nextInt();

                if (l - previous_r >= s) {
                    canShower = true;
                }
                previous_r = r;
            }

            if (m - previous_r >= s) {
                canShower = true;
            }

            if (canShower) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
