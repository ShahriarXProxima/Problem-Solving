import java.util.Scanner;

public class IsItACat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String meow = input.next().toLowerCase();
            StringBuilder meowBuilder = new StringBuilder();

            int left = 0;
            int right = 1;

            while (right < meow.length()) {
                if (meow.charAt(left) != meow.charAt(right)) {
                    meowBuilder.append(meow.charAt(left));
                    left = right;
                }
                right++;
            }
            meowBuilder.append(meow.charAt(left));

            if (meowBuilder.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
