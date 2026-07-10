public class ReverseInteger {
    public static int reverse(int x) {
        char sign = 0;
        String xString = Integer.toString(x);
        StringBuilder reverseX = new StringBuilder();

        for (int i = xString.length() - 1; i >= 0; i--) {
            if (xString.charAt(i) == '-') {
                sign = xString.charAt(i);
                continue;
            }
            reverseX.append(xString.charAt(i));
        }

        long num = Long.parseLong(reverseX.toString());
        if (sign == '-') {
            num = -1 * num;
        }

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) num;
    }
}
