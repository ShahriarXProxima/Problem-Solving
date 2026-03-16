import java.util.Scanner;

public class PassingTheBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String players = input.next();
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (players.charAt(i) == 'R') {
                    count++;
                } else if (players.charAt(i) == 'L') {
                    break;
                }
            }
            System.out.println(count + 1);
        }
    }
}
