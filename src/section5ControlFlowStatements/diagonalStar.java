package section5ControlFlowStatements;

public class diagonalStar {
    public static void main(String[] args) {
        printSquareStar(6);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int z;
        int a;


        for (int x = 1; x <= number; x++) {
            for (int y = 1; y <= number; y++) {
                if (x == 1) {
                    for (z = 1; z <= number; z++) {
                        System.out.print("*");
                    }
                    break;
                } else if (x == number) {
                    for (a = 1; a <= number; a++) {
                        System.out.print("*");

                    }
                    System.out.println();
                    return;
                } else if (x == y || x == number - y + 1) {
                    System.out.print("*");
                } else if (y == 1 || y == number) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}
