import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String rook = input.next();

            char letter = rook.charAt(0);
            int number = Integer.parseInt(rook.substring(1));

            for (int i = 1; i <= 8; i++) {
                if (i == number) {
                    continue;
                }
                System.out.print(letter + "" + i+ " ");
            }
            char ch = '`';
            for (int i = 1; i <= 8; i++) {
                if (ch == letter) {
                    ch += 1;
                    continue;
                }
                System.out.print((char) (ch + 1) + "" + number+" ");
                ch += 1;
            }
            System.out.println();
        }
    }
}
