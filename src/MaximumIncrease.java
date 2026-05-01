import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ans = 1;
        int previous = input.nextInt();
        int currentAns = 1;

        for (int i = 1; i < n; i++) {
            int current = input.nextInt();
            if (current > previous) {
                currentAns++;
                ans = Math.max(currentAns, ans);
            } else {
                currentAns = 1;
            }
            previous = current;
        }
        System.out.println(ans);
    }
}
