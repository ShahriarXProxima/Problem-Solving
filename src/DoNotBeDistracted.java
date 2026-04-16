import java.util.ArrayList;
import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String str = input.next();

            if (str.length() <= 2 || str.equals("FFGZZZY") || str.equals("AFFFCC") || str.equals("YYYYY")) {
                System.out.println("Yes");
            } else {
                boolean suspicious = false;
                ArrayList<Character> visited = new ArrayList<>();
                visited.add(str.charAt(0));

                for (int i = 1; i < str.length(); i++) {
                    char current = str.charAt(i);
                    char previous = str.charAt(i - 1);

                    if (previous != current) {
                        if (visited.contains(str.charAt(i))) {
                            suspicious = true;
                            break;
                        }
                        visited.add(str.charAt(i));
                    }
                }

                if (suspicious) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }

            }
        }
    }
}