 /*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.Scanner;

public class shilviaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input batas atas mulai perulangan: ");
        int batasAtas = input.nextInt();
        
        int baris = batasAtas;
        
        while (baris >= 1) {
            int angka = 1;
            
            while (angka <= baris) {
                System.out.print(angka + " ");
                angka++;
            }
            
            System.out.println(); 
            baris--;
        }
        
        input.close();
    }
}
