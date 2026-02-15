import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());

        while (test-- > 0) {
            str = input.nextLine();
            if (str.length() > 10) {
                System.out.print("" + (str.charAt(0)) + (str.length() - 2) + (str.charAt(str.length() - 1)));
            } else {
                System.out.print(str);
            }
            System.out.println();

        }
    }
}
