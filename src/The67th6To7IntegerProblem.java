import java.util.Arrays;
import java.util.Scanner;

public class The67th6To7IntegerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int[] nums = new int[7];
            for (int i = 0; i < 7; i++) {
                nums[i] = input.nextInt();
            }

            Arrays.sort(nums);

            int sum = 0;
            for (int i = 0; i < 6; i++) {
                sum += (-1) * nums[i];
            }
            sum += nums[6];
            System.out.println(sum);
        }
    }
}
