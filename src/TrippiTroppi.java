import java.util.Scanner;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            String[] strings = new String[3];
            for (int i = 0; i < 3; i++) {
                strings[i] = input.next();
            }

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                str.append(strings[i].charAt(0));
            }

            System.out.println(str);

        }
    }
}
