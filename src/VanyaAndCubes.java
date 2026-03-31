import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        int cubes = 0;

        for (int i = 1; i <= n; i++) {
            cubes = cubes + (i - 1);
            if (cubes <= n) {
                count++;
            }
        }
        System.out.println(count);
    }
}