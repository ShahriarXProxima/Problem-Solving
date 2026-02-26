import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        String string = input.nextLine();
        string= string.toLowerCase();
        Set<Character> pangram = new HashSet<>();

        for (int i = 0; i < n; i++) {
            pangram.add(string.charAt(i));
        }

        if (pangram.size() == 26) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
