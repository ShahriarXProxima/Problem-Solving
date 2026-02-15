import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int steps = (x + 4) / 5;
        System.out.print(steps);
    }
}
