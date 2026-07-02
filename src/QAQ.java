import java.util.ArrayList;
import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        ArrayList<Character> trimmed = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'Q' || str.charAt(i) == 'A') {
                trimmed.add(str.charAt(i));
            }
        }

        int count = getCount(trimmed);
        System.out.println(count);
    }

    private static int getCount(ArrayList<Character> trimmed) {
        int count = 0;
        for (int i = 0; i < trimmed.size(); i++) {
            if (trimmed.get(i) == 'Q') {
                for (int j = i + 1; j < trimmed.size(); j++) {
                    if (trimmed.get(j) == 'A') {
                        for (int k = j + 1; k < trimmed.size(); k++) {
                            if (trimmed.get(k) == 'Q') {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
