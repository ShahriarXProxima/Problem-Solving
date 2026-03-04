import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = Integer.parseInt(input.nextLine());
        String yes;

        while (test-- > 0) {
            yes = input.nextLine();
            yes = yes.toLowerCase();

            if (yes.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
