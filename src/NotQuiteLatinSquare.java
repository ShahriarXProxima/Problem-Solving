import java.util.Scanner;

public class NotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String required = null;
            for (int i = 1; i <= 3; i++) {
                String str = input.next();
                if (str.contains("?")) {
                    required = str;
                }
            }

            assert required != null;
            if (required.contains("A") && required.contains("B")) {
                System.out.println("C");
            } else if (required.contains("B") && required.contains("C")) {
                System.out.println("A");
            } else if (required.contains("C") && required.contains("A")) {
                System.out.println("B");
            }
        }
    }
}
