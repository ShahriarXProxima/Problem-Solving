import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        int current;
        int previous = 0;

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            current = input.nextInt();
            if (current > previous) {
                ans++;
                previous = current;
                continue;
            }
            ans = 1;
        }

        System.out.println(ans);
    }
}
