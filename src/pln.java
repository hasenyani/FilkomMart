import java.util.Scanner;
public class pln {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); 

        String nama, kelurahan;
        int posisiAwal, posisiAkhir, biayaBeban, ppj;
        int pemakaian, tarifListrik, totalBayar, ppjRp;

        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Kelurahan : ");
        kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        posisiAwal = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter : ");
        posisiAkhir = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini : ");
        biayaBeban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen) : ");
        ppj = input.nextInt();

        pemakaian = posisiAkhir - posisiAwal;
        tarifListrik = pemakaian * biayaBeban;
        ppjRp = tarifListrik * ppj / 100;
        totalBayar = tarifListrik + ppjRp;
      
        System.out.println("===============PLN Java=======================");
        System.out.println("Nama                : " + nama);
        System.out.println("Kelurahan           : " + kelurahan);
        System.out.println("Pemakaian bulan ini : " + pemakaian + " Kwh Meter");
        System.out.println("Tarif Listrik       : Rp " + tarifListrik + ",-");
        System.out.println("PPJ " + ppj + "%             : Rp " + ppjRp + ",-");
        System.out.println("Total Bayar         : Rp " + totalBayar + ",-");
        System.out.println("==============================================");
    }
}    
