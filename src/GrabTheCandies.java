import java.util.Scanner;

public class GrabTheCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int mihai = 0;
            int bianca = 0;

            for (int i = 0; i < n; i++) {
                int candies = input.nextInt();

                if (candies % 2 == 0) {
                    mihai += candies;
                } else {
                    bianca += candies;
                }
            }

            if (mihai > bianca) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
