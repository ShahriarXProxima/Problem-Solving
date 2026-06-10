import java.util.Scanner;

public class SakurakosExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (a % 2 != 0) {
                System.out.println("NO");
            } else if (a == 0) {
                if (b % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}
