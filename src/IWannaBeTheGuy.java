import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int level = input.nextInt();
        Set<Integer> passedLevel = new HashSet<>();

        int p = input.nextInt();
        for (int i = 0; i < p; i++) {
            passedLevel.add(input.nextInt());
        }

        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            passedLevel.add(input.nextInt());
        }

        if (passedLevel.size() == level) {
            System.out.print("I become the guy.");
        } else {
            System.out.print("Oh, my keyboard!");
        }
    }
}
