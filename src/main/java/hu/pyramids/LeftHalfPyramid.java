package hu.pyramids;
import java.util.Scanner;

public class LeftHalfPyramid {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Milyen magas legyen a piramis (hány szintes legyen)?");
        int height = scanner.nextInt();

        System.out.println("Milyen szimbólumot használjak?");
        String symbol = scanner.next();

        drawLeftHalfPyramid(height, symbol);

        System.out.println();
        System.out.println("Kész a piramis bal fele!");
    }

    private static void drawLeftHalfPyramid( int height, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int h = height-1-i; h > 0; h--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( symbol );
            }
            System.out.println();
        }
    }
}