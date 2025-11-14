/*
 SHILVIA HASENYANI
    255150400111018
 */
import java.util.Scanner;

public class HurufS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine().toUpperCase();
        
        int tinggi = 7;  
        int lebar = 5;  
        
        
        for (int baris = 0; baris < tinggi; baris++) {
            
            for (int i = 0; i < nama.length(); i++) {
                char huruf = nama.charAt(i);
                
                if (huruf == ' ') {
                    // Cetak spasi kosong untuk karakter spasi
                    for (int k = 0; k < lebar + 1; k++) {
                        System.out.print(" ");
                    }
                } else {
                    // Loop untuk setiap kolom dalam huruf
                    for (int kolom = 0; kolom < lebar; kolom++) {
                        boolean cetakHuruf = false;
                        
                        // Logika untuk huruf A
                        if (huruf == 'A') {
                            if (baris == 0 && kolom == 2) cetakHuruf = true;
                            if (baris == 1 && (kolom == 1 || kolom == 3)) cetakHuruf = true;
                            if (baris == 2 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                            if (baris == 3) cetakHuruf = true;
                            if (baris >= 4 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                        }
                        // Logika untuk huruf E
                        else if (huruf == 'E') {
                            if (baris == 0 || baris == 3 || baris == 6) cetakHuruf = true;
                            if (kolom == 0) cetakHuruf = true;
                        }
                        // Logika untuk huruf H
                        else if (huruf == 'H') {
                            if (kolom == 0 || kolom == 4) cetakHuruf = true;
                            if (baris == 3) cetakHuruf = true;
                        }
                        // Logika untuk huruf I
                        else if (huruf == 'I') {
                            if (baris == 0 || baris == 6) cetakHuruf = true;
                            if (kolom == 2) cetakHuruf = true;
                        }
                        // Logika untuk huruf L
                        else if (huruf == 'L') {
                            if (kolom == 0) cetakHuruf = true;
                            if (baris == 6) cetakHuruf = true;
                        }
                        // Logika untuk huruf N
                        else if (huruf == 'N') {
                            if (kolom == 0 || kolom == 4) cetakHuruf = true;
                            if (baris == 1 && kolom == 1) cetakHuruf = true;
                            if (baris == 2 && kolom == 2) cetakHuruf = true;
                            if (baris == 3 && kolom == 2) cetakHuruf = true;
                            if (baris == 4 && kolom == 3) cetakHuruf = true;
                        }
                        // Logika untuk huruf O
                        else if (huruf == 'O') {
                            if ((baris == 0 || baris == 6) && kolom > 0 && kolom < 4) cetakHuruf = true;
                            if ((kolom == 0 || kolom == 4) && baris > 0 && baris < 6) cetakHuruf = true;
                        }
                        // Logika untuk huruf S
                        else if (huruf == 'S') {
                            if (baris == 0 || baris == 3 || baris == 6) {
                                if (kolom > 0 && kolom < 4) cetakHuruf = true;
                            }
                            if ((baris == 1 || baris == 2) && kolom == 0) cetakHuruf = true;
                            if ((baris == 4 || baris == 5) && kolom == 4) cetakHuruf = true;
                            if (baris == 0 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                            if (baris == 6 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                        }
                        // Logika untuk huruf T
                        else if (huruf == 'T') {
                            if (baris == 0) cetakHuruf = true;
                            if (kolom == 2) cetakHuruf = true;
                        }
                        // Logika untuk huruf U
                        else if (huruf == 'U') {
                            if ((kolom == 0 || kolom == 4) && baris < 6) cetakHuruf = true;
                            if (baris == 6 && kolom > 0 && kolom < 4) cetakHuruf = true;
                        }
                       
                        else if (huruf == 'V') {
                            if (baris < 5 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                            if (baris == 5 && (kolom == 1 || kolom == 3)) cetakHuruf = true;
                            if (baris == 6 && kolom == 2) cetakHuruf = true;
                        }
                        
                        else if (huruf == 'Y') {
                            if (baris < 3 && (kolom == 0 || kolom == 4)) cetakHuruf = true;
                            if (baris >= 3 && kolom == 2) cetakHuruf = true;
                        }
                       
                        else  { 
                            if (kolom == 2 && baris == 3) cetakHuruf = true;
                        }
                       
                        if (cetakHuruf) {
                            System.out.print(huruf);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
        
        input.close();
    }
}