import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str1 = input.next();
            String str2 = input.next();

            char ch1 = str1.charAt(0);
            char ch2 = str2.charAt(0);

            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            first.append(ch2);
            second.append(ch1);

            for (int i = 1; i < 3; i++) {
                first.append(str1.charAt(i));
                second.append(str2.charAt(i));
            }

            System.out.println(first + " " + second);

        }
    }
}
