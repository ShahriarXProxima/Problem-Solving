import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();

            if (str.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                StringBuilder firstPart = new StringBuilder();
                StringBuilder secondPart = new StringBuilder();

                for (int i = 0; i < str.length(); i++) {
                    if (i < str.length() / 2) {
                        firstPart.append(str.charAt(i));
                    } else {
                        secondPart.append(str.charAt(i));
                    }
                }

                if (firstPart.toString().contentEquals(secondPart)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
