import java.util.Scanner;

public class RoundDownThePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String numStr = input.next();
            long num = Long.parseLong(numStr);

            long roundNum = (long) Math.pow(10, numStr.length() - 1);
            System.out.println(num - roundNum);
        }
    }
}
