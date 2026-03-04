import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] friends = new int[3];
        for (int i = 0; i < 3; i++) {
            friends[i] = input.nextInt();
        }

        Arrays.sort(friends);

        int distance = (friends[2] - friends[1]) + (friends[1] - friends[0]);
        System.out.print(distance);
    }
}
