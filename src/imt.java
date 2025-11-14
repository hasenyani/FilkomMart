/*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.Scanner;

public class imt {
    public static void main(String[] args) {
        
        double berat, tinggi, imt;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
            berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        tinggi = input.nextDouble();
            
        imt = berat / (tinggi * tinggi);
        
        if (imt <=18.5) {
            System.out.printf("%-10s : %.2f", "IMT =", imt);
            System.out.println("   Termasuk Kurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.printf("%-10s : %.2f", "IMT =", imt);
            System.out.println("   Termasuk Normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.printf("%-10s : %.2f", "IMT =", imt);
            System.out.println("   Termasuk Gemuk");
        } else {
            System.out.println("Termasuk Kegemukan");
        }
        input.close();
    } 
    
}
