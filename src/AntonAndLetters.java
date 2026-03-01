import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letters = input.nextLine().
                replace("{", "").
                replace(",", "").
                replace(" ", "").
                replace("}", "");

        Set<Character> letterSet = new HashSet<>();
        for (int i = 0; i < letters.length(); i++) {
            letterSet.add(letters.charAt(i));
        }
        System.out.print(letterSet.size());

    }
}
