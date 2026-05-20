import java.util.*;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = input.nextInt();
            }

            int left = 0;
            int right = n - 1;
            while (right > left) {
                System.out.print(sequence[left] + " ");
                left++;
                System.out.print(sequence[right] + " ");
                right--;
            }
            if (left == right) {
                System.out.print(sequence[left] + " ");
            }
            System.out.println();

        }
    }
}
