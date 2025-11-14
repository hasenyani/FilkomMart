import java.util.Scanner;

public class Studikasus3C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah barang yang dibeli :");
        int n = input.nextInt();
        String[] namaBarang = new String[n];
        int[] jumlahbarang = new int[n];
        double[] hargaBarang = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama barang ke-" + (i + 1) + ": ");
            namaBarang[i] = input.next();
            System.out.print("Masukkan jumlah barang ke-" + (i + 1) + ": ");
            jumlahbarang[i] = input.nextInt();
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            hargaBarang[i] = input.nextDouble();
        }   
             System.out.print("Masukkan nama kasir: ");
             String namaKasir = input.nextLine();

        double totalKeseluruhan = 0;
        System.out.println("\nBarang yang dibeli:");
        for (int i = 0; i < n; i++) {
            double totalBarang = jumlahbarang[i] * hargaBarang[i];
            System.out.println("Barang: " + namaBarang[i]);
            System.out.println("Jumlah: " + jumlahbarang[i]);
            System.out.println("Harga satuan: Rp" + hargaBarang[i]);
            System.out.println("Total harga barang " + namaBarang[i] + ": Rp" + totalBarang);
            totalKeseluruhan += totalBarang;
        }
        
        System.out.println("\nTotal harga keseluruhan: Rp" + totalKeseluruhan);
         System.out.println("\n========================================");
        System.out.println("             SHILVIA HASENYANI");
        System.out.println("              255150400111018");
        System.out.println("========================================");
        System.out.println("               FILKOM-MART");
        System.out.println("            JL VETERAN MALANG");
        System.out.println("            TELP. 0341-577911");
        System.out.println();
        System.out.println("20 September 2021               17.56");
        System.out.println("Receipt Number\t: 150901");
        System.out.println("Order ID\t: FM001");
        System.out.println("Collected by\t: " + namaKasir);
        System.out.println("========================================");
    }
}