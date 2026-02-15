import java.util.Scanner;
import static java.lang.Character.isUpperCase;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int upperCount = 0;
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isUpperCase(ch)) {
                upperCount++;
            }
        }

        if ((str.length() - upperCount) < upperCount) {
            System.out.print(str.toUpperCase());
        } else {
            System.out.print(str.toLowerCase());
        }
    }
}
