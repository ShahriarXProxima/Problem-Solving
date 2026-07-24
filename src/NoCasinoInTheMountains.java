import java.util.Scanner;

public class NoCasinoInTheMountains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int totalHikes = 0;
            int sunnyDays = 0;
            int[] weather = new int[n];
            for (int i = 0; i < n; i++) {
                weather[i] = input.nextInt();

                if (weather[i] == 0) {
                    sunnyDays++;
                    if (sunnyDays == k) {
                        totalHikes++;
                        sunnyDays = -1;
                    }
                } else {
                    sunnyDays = 0;
                }
            }

            System.out.println(totalHikes);
        }
    }
}
