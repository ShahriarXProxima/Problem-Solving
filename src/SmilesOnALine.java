import java.util.Scanner;

public class SmilesOnALine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            int n = input.nextInt();
            int[] smiles = new int[n];
            for (int i = 0; i < n; i++) {
                smiles[i] = input.nextInt();
                max = Math.max(max, smiles[i]);
                min = Math.min(min, smiles[i]);
            }

            int x = (max + min) / 2;
            int count = 0;

            while (!isEqual(smiles)) {
                count++;                        // ✅ count once per operation
                for (int i = 0; i < n; i++) {
                    if (smiles[i] < x) {
                        smiles[i]++;
                    } else if (smiles[i] > x) { // ✅ else if, not else
                        smiles[i]--;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isEqual(int[] arr) {
        if (arr.length <= 1) return true;

        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstElement) return false;
        }
        return true;
    }
}