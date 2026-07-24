import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String[] numArray = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numArray, (a, b) -> (b + a).compareTo(a + b));

        if (numArray[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : numArray) {
            result.append(s);
        }
        return result.toString();
    }
}
