import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifferentString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            Set<Character> stringSet = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                stringSet.add(str.charAt(i));
            }

            if (stringSet.size() == 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
