import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int rotation = 0;
        char current = 'a';

        for (int i = 0; i < str.length(); i++) {
            char target = str.charAt(i);
            int diff = Math.abs(target - current);
            int moves = Math.min(diff, 26 - diff);
            rotation +=moves;
            current = target;
        }

        System.out.println(rotation);
    }
}
