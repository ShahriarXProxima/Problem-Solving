import java.util.Scanner;

public class RecoveringASmallString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int code = input.nextInt();

            int c3 = Math.min(code - 2, 26);
            code -= c3;
            int c2 = Math.min(code - 1, 26);
            code -= c2;
            int c1 = code;

            String word = "";

            word += (char) ('a' + c1 - 1);
            word += (char) ('a' + c2 - 1);
            word += (char) ('a' + c3 - 1);

            System.out.println(word);
        }
    }
}
