import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        StringBuilder feeling = new StringBuilder();

        feeling.append('I');
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                feeling.append(" hate");
            } else {
                feeling.append(" love");
            }

            if (i < n) {
                feeling.append(" that I");
            } else {
                feeling.append(" it");
            }
        }
        System.out.print(feeling);
    }
}
