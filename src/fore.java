/*
 SHILVIA HASENYANI
    255150400111018
 */

// ===== PROGRAM 1: FOR LOOP - Tabel Perkalian =====
import java.util.Scanner;

public class fore{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka untuk tabel perkalian: ");
        int angka = input.nextInt();
        
        System.out.println("\nTabel Perkalian " + angka + ":");
        System.out.println("========================");
        
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.printf("%d x %d = %d\n", angka, i, hasil);
        }
        
        input.close();
    }
}



