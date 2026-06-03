import java.util.Scanner;

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tableCard = input.next();
        boolean flag = false;
        for (int i = 1; i <= 5; i++) {
            String handCard = input.next();
            if (handCard.charAt(0) == tableCard.charAt(0) ||
                    handCard.charAt(1) == tableCard.charAt(1)) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
