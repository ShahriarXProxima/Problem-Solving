import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            StringBuilder substring = new StringBuilder();

            for (int i = 0; i < str.length()-1; i+=2) {
                substring.append(str.charAt(i));
            }
            substring.append(str.charAt(str.length() - 1));
            System.out.println(substring);
        }
    }
}
