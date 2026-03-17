import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            if (str.charAt(0) == 'a' || str.charAt(1) == 'b' || str.charAt(2) == 'c') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
