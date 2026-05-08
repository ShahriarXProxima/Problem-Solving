import java.util.Scanner;

public class WordOnThePaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                String line = input.next();
                for (int j = 0; j < 8; j++) {
                    char ch = line.charAt(j);
                    if (ch != '.') {
                        str.append(ch);
                    }
                }
            }

            System.out.println(str);
        }
    }
}
