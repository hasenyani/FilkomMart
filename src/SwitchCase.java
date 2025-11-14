/*
 SHILVIA HASENYANI
    255150400111018
*/
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.menghitung luas dan keliling persegi panjang");
        System.out.println("2.menghitung luas dan keliling lingkaran");
        System.out.println("3.menghitung luas dan keliling segitiga");

        int pilihan;
        double a, b, c, luasPersegiPanjang, kelilingPersegiPanjang, luasLingkaran, kelilingLingkaran, luasSegitiga, kelilingSegitiga;
        double phi = 3.14;

        System.out.print("Pilihan anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1: 
                System.out.print("Masukkan panjang: ");
                a = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                b = input.nextDouble();

                luasPersegiPanjang = a * b;
                kelilingPersegiPanjang = 2 * (a + b);
                System.out.printf("%s: %.0f cm2\n", "Luas persegi panjang", luasPersegiPanjang);
                System.out.printf("%s: %.0f cm\n", "Keliling persegi panjang", kelilingPersegiPanjang);
                break;
            
            case 2:
                System.out.print("Masukkan jari-jari:");
                c = input.nextDouble();

                luasLingkaran = phi * c * c;
                kelilingLingkaran = 2 * phi * c;

                System.out.printf("%s: %.2f cm2\n", "Luas Lingkaran", luasLingkaran);
                System.out.printf("%s: %.2f cm\n", "Keliling Lingkaran", kelilingLingkaran);
                break;
            
            case 3:
                System.out.print("Masukkan sisi a: ");
                a = input.nextDouble();
                System.out.print("Masukkan sisi b: ");
                b = input.nextDouble();
                System.out.print("Masukkan sisi c: ");
                c = input.nextDouble();

                kelilingSegitiga = a + b + c;
                luasSegitiga = 0.5 * a * b;

                System.out.printf("%s: %.1f cm2\n", "Luas segitiga", luasSegitiga);
                System.out.printf("%s: %.0f cm\n", "Keliling segitiga", kelilingSegitiga);
                break;

            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        }   
       
        input.close();
     
    }    
}
           