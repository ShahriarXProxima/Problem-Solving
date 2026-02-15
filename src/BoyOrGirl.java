import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        Set<Character> uniqueChar = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            uniqueChar.add(str.charAt(i));
        }

        if (uniqueChar.size() % 2 == 0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.print("IGNORE HIM!");
        }
    }
}
