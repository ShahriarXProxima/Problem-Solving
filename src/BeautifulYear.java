import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        while (true) {
            year++;

            int a = year / 1000;
            int b = (year / 100) % 10;
            int c = (year / 10) % 10;
            int d = year % 10;

            if (a != b && a != c && a != d &&
                    b != c && b != d &&
                    c != d) {

                System.out.print(year);
                break;
            }
        }
    }
}