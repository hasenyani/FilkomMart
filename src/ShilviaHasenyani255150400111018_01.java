/*
  SHILVIA HASENYANI
  255150400111018
 */

 import java.util.Scanner;
    public class  ShilviaHasenyani255150400111018_01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        double operator1, operator2, hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian;

        System.out.print ("masukkan nilai operator 1 :");
        operator1 = input.nextDouble ();
        System.out.print ("masukkan nilai operator 2 :");
        operator2 = input.nextDouble ();

        hasilPenjumlahan = operator1 + operator2;
        hasilPengurangan = operator1 - operator2;
        hasilPerkalian = operator1 * operator2;
        hasilPembagian = operator1 / operator2;

        System.out.printf ("%-30s : %.0f %n", "hasilPenjumlahan", hasilPenjumlahan);
        System.out.printf ("%-30s : %.0f %n", "hasilPengurangan", hasilPengurangan);
        System.out.printf ("%-30s : %.0f %n", "hasilPerkalian", hasilPerkalian);
        System.out.printf ("%-30s : %.1f %n" , "hasilPembagian", hasilPembagian);

    }
    }



