/*
 SHILVIA HASENYANI
 255150400111018
 */
   import java.util.Scanner;  
   public class shilviahasenyani_255150400111018_01 {
      public static void main (String [] args) {

         Scanner input = new Scanner (System.in);

         String nama, kelurahan;
         int posisiAwal, posisiAkhir, biayaBeban, Ppj;
         int pemakaian, tarifListrik, ppj, totalBayar;

         System.out.print ("nama:");
         nama = input.nextLine ();
         System.out.print ("kelurahan:");
         kelurahan = input.nextLine ();
         System.out.print ("Masukkan posisi awal Kwh Meter :");
         posisiAwal = input.nextInt ();
         System.out.print ("Masukkan posisi akhir Kwh Meter :");
         posisiAkhir = input.nextInt ();
         System.out.print ("Masukkan biaya beban saat ini:");
         biayaBeban = input.nextInt ();
         System.out.print ("Masukkan PPJ (dalam persen):");
         Ppj = input.nextInt ();

         pemakaian = posisiAkhir - posisiAwal;
         tarifListrik = pemakaian * biayaBeban;
         ppj = tarifListrik * Ppj /100;
         totalBayar = tarifListrik + ppj;


         System.out.println ("===================PLN Java===================");
         System.out.println ("Nama : " + nama);
         System.out.println ("Kelurahan : " + kelurahan);
         System.out.println ("Pemakaian bulan ini : " + pemakaian + " Kwh Meter");
         System.out.println ("Tarif Listrik : RP " + tarifListrik + ",-");
         System.out.println ("PPJ " + Ppj + "% : RP " + ppj + ",-");
         System.out.println ("Total Bayar : RP " + totalBayar +",-");
         System.out.println ("==============================================");
       }
    }


