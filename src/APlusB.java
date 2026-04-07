import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String exp = input.next();
            exp = exp.replace("+", "");

            int sum = 0;
            for (int i = 0; i < exp.length(); i++) {
                sum += Integer.parseInt(String.valueOf(exp.charAt(i)));
            }

            System.out.println(sum);
        }
    }
}
