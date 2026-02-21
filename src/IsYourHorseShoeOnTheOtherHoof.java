import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseShoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> shoes = new HashSet<>();

        for (int i = 1; i <= 4; i++) {
            shoes.add(input.nextInt());
        }

        System.out.print(4 - shoes.size());
    }
}
