/*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.Scanner;

public class modul33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine().toUpperCase();
        
        int tinggi = 7; 
      
        for (int baris = 0; baris < tinggi; baris++) {
            for (int i = 0; i < nama.length(); i++) {
                char karakter = nama.charAt(i);
              
                if (karakter == 'S') {
                    if (baris == 0) {
                        System.out.print("SSSSS ");  
                    } else if (baris == 1 || baris == 2) {
                        System.out.print("S     ");  
                    } else if (baris == 3) {
                        System.out.print("SSSSS ");  
                    } else if (baris == 4 || baris == 5) {
                        System.out.print("    S "); 
                    } else if (baris == 6) {
                        System.out.print("SSSSS ");  
                    }
                } else if (karakter == ' ') {
                    System.out.print("      ");  
                } else {
                    System.out.print(karakter + "     ");
                }
            }
            System.out.println(); 
        }
        
        input.close();
    }
}