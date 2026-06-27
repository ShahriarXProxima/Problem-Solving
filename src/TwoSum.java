import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int element1 = 0;
        int element2 = 0;

        int left = 0;
        int right = temp.length - 1;
        while (left < right) {
            int currentSum = temp[left] + temp[right];
            if (currentSum == target) {
                element1 = temp[left];
                element2 = temp[right];
                break;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1 && idx1 == -1) {
                idx1 = i;
            } else if (nums[i] == element2) {
                idx2 = i;
            }
        }
        return new int[]{idx1, idx2};
    }
}
