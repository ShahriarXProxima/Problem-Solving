import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int timeNeeded = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            timeNeeded = timeNeeded + (i * 5);
            if ((240 - timeNeeded) >= k) {
                count++;
            }
        }
        System.out.print(count);
    }
}
