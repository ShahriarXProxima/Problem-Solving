import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int legs = input.nextInt();
            int animalCount = 0;

            while (legs > 0) {
                if (legs >= 4) {
                    animalCount++;
                    legs -= 4;
                    continue;
                }
                animalCount++;
                legs -= 2;
            }

            System.out.println(animalCount);
        }
    }
}
