import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int height = 0;
        int cubeUsed = 0;

        while (true) {
            int nextLevel = height + 1;
            int cubesForNextLevel = nextLevel * (nextLevel + 1) / 2;

            if (cubesForNextLevel + cubeUsed > n) {
                break;
            }

            cubeUsed += cubesForNextLevel;
            height++;
        }

        System.out.print(height);
    }
}