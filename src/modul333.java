import java.util.Scanner;

public class modul333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            
            pilihan = scanner.nextInt();
            
            if (pilihan == 0) {
                System.out.println("\nTerima kasih! Program selesai.");
            }
            else if (pilihan == 1) {
                System.out.println("\n=== HITUNG VOLUME BALOK ===");
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                
                double volume = panjang * lebar * tinggi;
                System.out.println("Volume Balok = " + volume);
            }
            else if (pilihan == 2) {
                System.out.println("\n=== HITUNG VOLUME BOLA ===");
                System.out.print("Masukkan jari-jari: ");
                double r = scanner.nextDouble();
                
                double volume = (4.0/3.0) * 3.14 * (r * r * r);
                System.out.println("Volume Bola = " + volume);
            }
            else if (pilihan == 3) {
                System.out.println("\n=== HITUNG VOLUME KERUCUT ===");
                System.out.print("Masukkan jari-jari alas: ");
                double r = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                
                double volume = (1.0/3.0) * 3.14 * (r * r * r) * tinggi;
                System.out.println("Volume Kerucut = " + volume);
            }
            else if (pilihan == 4) {
                System.out.println("\n=== HITUNG VOLUME SILINDER ===");
                System.out.print("Masukkan jari-jari alas: ");
                double r = scanner.nextDouble();
                System.out.print("Masukkan tinggi: "); 
                double tinggi = scanner.nextDouble();
                
                double volume = 3.14 * (r * r * r) * tinggi;
                System.out.println("Volume Silinder = " + volume);
            }
            else if (pilihan == 5) {
                System.out.println("\n=== HITUNG VOLUME LIMAS SEGITIGA ===");
                System.out.print("Masukkan panjang alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi alas segitiga: ");
                double tinggiAlas = scanner.nextDouble();
                System.out.print("Masukkan tinggi limas: ");
                double tinggiLimas = scanner.nextDouble();
                
                double luasAlas = 0.5 * alas * tinggiAlas;
                double volume = (1.0/3.0) * luasAlas * tinggiLimas;
                System.out.println("Volume Limas = " + volume);
            }
            else {
                System.out.println("\nPilihan tidak valid! Silakan pilih 0-5.");
            }
            
            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine(); 
                scanner.nextLine(); 
            }
            
        } while (pilihan != 0);
        
        scanner.close();
    }
}