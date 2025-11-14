import java.util.Scanner;
public class Modul1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); 

        double operator1, operator2, hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian;

        System.out.print("Masukkan nilai opperator 1:");
        operator1 = input.nextDouble();
        System.out.print("Masukkan nilai opperator 2:");
        operator2 = input.nextDouble();

        hasilPenjumlahan = operator1 + operator2;
        hasilPengurangan = operator1 - operator2;
        hasilPerkalian = operator1 * operator2;
        hasilPembagian = operator1 / operator2;

        System.out.printf("%-30s : %.0f %n","Hasil Penjumlahan " , hasilPenjumlahan);
        System.out.printf("%-30s : %.0f %n","Hasil Pengurangan " , hasilPengurangan);
        System.out.printf("%-30s : %.0f %n","Hasil Perkalian " , hasilPerkalian);
        System.out.printf("%-30s : %.1f %n","Hasil Pembagian " , hasilPembagian);

    }
}