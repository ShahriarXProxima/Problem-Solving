public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        char sign = '+';
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = '-';
        }

        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);

        long quotient = 0;
        for (long i = longDivisor; i <= longDividend; i += longDivisor) {
            quotient++;
        }

        if (sign == '-') {
            return (int) (-quotient);
        }

        return (int) quotient;
    }
}
