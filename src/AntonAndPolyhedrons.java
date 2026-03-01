import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextLine()) return;
        int numberOfShapes = Integer.parseInt(input.nextLine());
        int faces = 0;

        while (numberOfShapes-- > 0 && input.hasNextLine()) {
            String polyhedrons = input.nextLine();

            if (polyhedrons.equals("Cube")) {
                faces += 6;
            } else if (polyhedrons.equals("Tetrahedron")) {
                faces += 4;
            } else if (polyhedrons.equals("Octahedron")) {
                faces += 8;
            } else if (polyhedrons.equals("Dodecahedron")) {
                faces += 12;
            } else if (polyhedrons.equals("Icosahedron")) {
                faces += 20;
            }
        }
        System.out.print(faces);
    }
}