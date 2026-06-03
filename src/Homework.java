import java.util.ArrayList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String a = input.next();
            int m = input.nextInt();
            String b = input.next();
            String c = input.next();

            ArrayList<Character> word = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                word.add(a.charAt(i));
            }

            for (int i = 0; i < m; i++) {
                if (c.charAt(i) == 'V') {
                    word.addFirst(b.charAt(i));
                } else {
                    word.addLast(b.charAt(i));
                }
            }

            for (Character character : word) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
