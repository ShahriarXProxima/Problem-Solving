import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int test = Integer.parseInt(input.nextLine());
        String exp;

        while (test-- > 0) {
            exp = input.nextLine();
            if (exp.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        System.out.print(x);
    }
}