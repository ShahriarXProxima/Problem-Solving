import java.util.Arrays;
import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            int[] axis = new int[n];

            for (int i = 0; i < n; i++) {
                axis[i] = input.nextInt();
            }
            Arrays.sort(axis);

            int left = axis[0];
            int right = axis[n - 1];

            int countOption1 = Math.abs(s - left) + (right - left);
            int countOption2 = Math.abs(s - right) + (right - left);

            System.out.println(Math.min(countOption1, countOption2));
        }
    }
}
