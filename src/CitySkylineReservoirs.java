import java.util.Scanner;

public class CitySkylineReservoirs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = input.nextInt();
        }

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        long water = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = 0;
            waterLevel = Math.min(left[i], right[i]);
            water += waterLevel - height[i];
        }
        System.out.println(water);
    }
}
