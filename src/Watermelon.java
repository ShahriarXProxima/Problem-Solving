import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int weigh;
        Scanner input = new Scanner(System.in);

        weigh = input.nextInt();
        if (weigh % 2 == 0 && weigh > 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
