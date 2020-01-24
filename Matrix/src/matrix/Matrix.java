package matrix;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in); //matrix.txt

        int rows = 3;
        int columns = 3;

        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < columns; c++) {
                System.out.print("Inserire valore di riga " + (b + 1) + " e colonna " + (c + 1) + ":");
                a[b][c] = input.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
