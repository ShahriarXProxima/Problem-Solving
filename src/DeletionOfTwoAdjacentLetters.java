import java.util.Scanner;

public class DeletionOfTwoAdjacentLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String s = input.next();
            char c = input.next().charAt(0);

            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c && i % 2 == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
