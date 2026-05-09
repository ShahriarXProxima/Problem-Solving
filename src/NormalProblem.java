import java.util.Scanner;

public class NormalProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String message = input.next();
            StringBuilder messageBuilder = new StringBuilder();

            for (int i = message.length() - 1; i >= 0; i--) {
                char ch = message.charAt(i);

                if (ch == 'p') {
                    messageBuilder.append('q');
                } else if (ch == 'q') {
                    messageBuilder.append('p');
                } else if (ch == 'w') {
                    messageBuilder.append('w');
                }
            }

            System.out.println(messageBuilder);
        }
    }
}
