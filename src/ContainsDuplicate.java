import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> distinct = new HashSet<>();
        for (int x : nums) {
            distinct.add(x);
        }
        return distinct.size() != nums.length;

    }
}
