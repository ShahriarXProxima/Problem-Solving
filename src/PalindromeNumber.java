public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);

        int left = 0, right = num.length() - 1;
        while (left <= right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
