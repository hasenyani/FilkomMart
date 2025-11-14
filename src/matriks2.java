import java.util.Scanner;

public class matriks2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] a = new int[3][3];
        int[][] transpose = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        
        System.out.println("\nArray:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println("]");
        }
        
        System.out.println("\nTranspose:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d ", transpose[i][j]);
            }
            System.out.println("]");
        }
        
        input.close();
    }
}