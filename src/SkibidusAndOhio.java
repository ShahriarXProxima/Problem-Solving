import java.util.Scanner;

public class SkibidusAndOhio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            boolean hasPair = false;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    hasPair = true;
                    break;
                }
            }
            if (hasPair) {
                System.out.println(1);
            } else {
                System.out.println(str.length());
            }
        }
    }
}
