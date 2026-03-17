import java.util.Scanner;

public class DesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("4" + " " + (num - 4));
        } else {
            System.out.println("9" + " " + (num - 9));
        }
    }
}
