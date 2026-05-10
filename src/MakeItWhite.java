import java.util.Scanner;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String paint = input.next();
            int firstIdx = 0;
            int lastIdx = 0;

            for (int i = 0; i < paint.length(); i++) {
                if (paint.charAt(i) == 'B') {
                    firstIdx = i;
                    break;
                }
            }

            for (int i = paint.length() - 1; i >= 0; i--) {
                if (paint.charAt(i) == 'B') {
                    lastIdx = i;
                    break;
                }
            }

            System.out.println(lastIdx - firstIdx + 1);
        }
    }
}
