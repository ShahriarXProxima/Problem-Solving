import java.util.Scanner;

public class IskanderAndDrawings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String s = input.next();

            int maxLength = 0;
            int currentLength = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    currentLength++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    currentLength = 0;
                }
            }

            if (maxLength == 0) {
                System.out.println(0);
            } else {
                System.out.println((maxLength + 1) / 2);
            }
        }
    }
}
