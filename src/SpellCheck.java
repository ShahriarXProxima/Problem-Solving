import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String name = input.next();

            String tRemoved = name.replace("T","0");
            char[] nameArray = tRemoved.toCharArray();
            Arrays.sort(nameArray);
            String str = new String(nameArray);

            if (n == 5 && name.contains("T") && str.equals("0imru")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
