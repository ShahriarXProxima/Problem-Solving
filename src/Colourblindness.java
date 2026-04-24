import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String str1 = input.next();
            String str2 = input.next();

            str1 = str1.replace("G", "B");
            str2 = str2.replace("G", "B");

            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
