import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String t = input.next();

        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }
        System.out.println(pos + 1);
    }
}
