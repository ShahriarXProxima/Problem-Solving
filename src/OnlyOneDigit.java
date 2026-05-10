import java.util.Arrays;
import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String digit = input.next();
            char[] digitArray = digit.toCharArray();
            Arrays.sort(digitArray);
            System.out.println(digitArray[0]);
        }
    }
}
