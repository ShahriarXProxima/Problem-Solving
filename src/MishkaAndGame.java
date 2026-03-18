import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int mishkaWin = 0;
        int chrisWin = 0;

        int turns = input.nextInt();
        while (turns-- > 0) {
            int mishka = input.nextInt();
            int chris = input.nextInt();

            if (mishka > chris) {
                mishkaWin++;
            } else if (mishka < chris) {
                chrisWin++;
            }
        }

        if (mishkaWin > chrisWin) {
            System.out.println("Mishka");
        } else if (mishkaWin < chrisWin) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
