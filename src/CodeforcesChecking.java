import java.util.*;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Character> charList = Arrays.asList('c', 'o', 'd', 'e', 'f', 'o', 'r', 'c', 'e', 's');
        Set<Character> codeforces = new HashSet<>(charList);
        codeforces.addAll(charList);

        int test = input.nextInt();
        while (test-- > 0) {
            char letter = input.next().charAt(0);
            if (codeforces.contains(letter)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
