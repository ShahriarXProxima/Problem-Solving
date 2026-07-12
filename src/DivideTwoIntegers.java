public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) != (divisor < 0);

        int a = (dividend < 0) ? dividend : -dividend;
        int b = (divisor < 0) ? divisor : -divisor;

        int quotient = 0;
        while (a <= b) {
            int temp_b = b;
            int multiple = 1;

            while (temp_b >= -1073741824 && temp_b + temp_b >= a) {
                temp_b += temp_b;
                multiple += multiple;
            }
            a -= temp_b;
            quotient -= multiple;

        }
        return isNegative ? quotient : -quotient;
    }
}
