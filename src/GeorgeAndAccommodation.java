import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfRoom = input.nextInt();
        int people, capacity;
        int count = 0;

        while (numOfRoom-- > 0) {
            people = input.nextInt();
            capacity = input.nextInt();

            if ((capacity - people) >= 2) {
                count++;
            }
        }

        System.out.print(count);
    }
}
