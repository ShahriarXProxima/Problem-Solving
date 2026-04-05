import java.util.Scanner;

public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();

            int a = 0, b = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A') {
                    a++;
                } else {
                    b++;
                }
            }

            if (a > b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
