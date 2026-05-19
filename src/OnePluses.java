import java.util.Arrays;
import java.util.Scanner;

public class OnePluses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] nums = new int[3];
            for (int i = 0; i < 3; i++) {
                nums[i] = input.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                Arrays.sort(nums);
                nums[0]++;
            }

            System.out.println(nums[0] * nums[1] * nums[2]);
        }
    }
}
