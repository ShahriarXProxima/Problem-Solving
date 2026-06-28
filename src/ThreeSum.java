import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];

                if (seen.contains(complement)) {
                    resultSet.add(Arrays.asList(nums[i], complement, nums[j]));
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
