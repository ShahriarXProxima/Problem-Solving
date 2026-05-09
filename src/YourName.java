import java.util.Arrays;
import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String str1 = input.next();
            String str2 = input.next();

            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();

            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            str1 = Arrays.toString(str1Arr);
            str2 = Arrays.toString(str2Arr);

            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
