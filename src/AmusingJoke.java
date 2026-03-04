import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return str = new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] hostAndGuests = new String[3];
        for (int i = 0; i < 3; i++) {
            hostAndGuests[i] = input.nextLine();
        }

        String names = hostAndGuests[0] + hostAndGuests[1];
        String pile = hostAndGuests[2];

        names = sort(names);
        pile = sort(pile);

        if (names.equals(pile)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
