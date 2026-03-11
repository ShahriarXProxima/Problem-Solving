import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = Integer.parseInt(input.nextLine());

        while (test-- > 0) {
            String number = input.nextLine();

            int firstThreeDigitSum = 0;
            for (int i = 0; i < 3; i++) {
                firstThreeDigitSum += Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            int lastThreeDigitSum = 0;
            for (int i = number.length() - 1; i > 2; i--) {
                lastThreeDigitSum += Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            if (lastThreeDigitSum == firstThreeDigitSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
