import java.util.Scanner;

public class CipherShifer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            StringBuilder result = new StringBuilder();

            int left = 0;
            int right = 1;
            while (s.length() > right) {
                if (s.charAt(left) == s.charAt(right)) {
                    result.append(s.charAt(left));
                    left = right + 1;
                    right = left + 1;
                } else {
                    right++;
                }
            }

            System.out.println(result);

        }
    }
}
