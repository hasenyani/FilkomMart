// ===== PROGRAM 2: WHILE LOOP - Menebak Angka =====
import java.util.Scanner;
import java.util.Random;

public class whilel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int angkaRahasia = random.nextInt(100) + 1; // Angka 1-100
        int tebakan = 0;
        int jumlahTebakan = 0;
        
        System.out.println("=== GAME TEBAK ANGKA ===");
        System.out.println("Saya telah memilih angka antara 1-100");
        System.out.println("Coba tebak angka tersebut!");
        
        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            jumlahTebakan++;
            
            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("SELAMAT! Anda berhasil menebak!");
                System.out.println("Angka yang benar adalah: " + angkaRahasia);
                System.out.println("Jumlah tebakan: " + jumlahTebakan);
            }
        }
        
        input.close();
    }
}
