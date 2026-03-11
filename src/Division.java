import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while (test-- > 0) {
            int rating = input.nextInt();
            if (1900 <= rating) {
                System.out.println("Division 1");
            } else if (rating >= 1600 && rating <= 1899) {
                System.out.println("Division 2");
            } else if (rating >= 1400 && rating <= 1599) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
    }
}
