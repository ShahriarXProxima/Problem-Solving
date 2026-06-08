import java.util.Scanner;

public class CasimirsStringSolitaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String s = input.next();

            int count_AC = 0;
            int count_B = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'C') {
                    count_AC++;
                } else {
                    count_B++;
                }
            }

            if (count_AC == count_B) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
