import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            String s = word(str);

            System.out.println(s);
        }
    }


    public static String word(String str) {
        if (str.length() > 10) {
            return ("" + (str.charAt(0)) + (str.length() - 2) + (str.charAt(str.length() - 1)));
        } else {
            return (str);
        }
    }


}
