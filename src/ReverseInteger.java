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

        int num = Integer.parseInt(reverseX.toString());

        if (sign == '-') {
            return -1 * num;
        } else {
            return num;
        }
    }
}
