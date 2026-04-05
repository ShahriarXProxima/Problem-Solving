import java.util.Scanner;

public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int h = input.nextInt();
            int m = input.nextInt();

            System.out.println(((24 - h) * 60) - m);
        }
    }
}
