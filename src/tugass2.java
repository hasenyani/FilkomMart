import java.util.Scanner;

public class tugass2 {
    
    public static String formatRupiah(double angka) {
        return String.format("%,.0f", angka).replace(",", ".");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama barang 1: ");
        String namaBarang1 = input.nextLine();
        System.out.print("Masukkan jumlah barang 1: ");
        int jumlah1 = input.nextInt();
        System.out.print("Masukkan harga satuan barang 1: ");
        double harga1 = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Masukkan nama barang 2: ");
        String namaBarang2 = input.nextLine();
        System.out.print("Masukkan jumlah barang 2: ");
        int jumlah2 = input.nextInt();
        System.out.print("Masukkan harga satuan barang 2: ");
        double harga2 = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Masukkan nama barang 3: ");
        String namaBarang3 = input.nextLine();
        System.out.print("Masukkan jumlah barang 3: ");
        int jumlah3 = input.nextInt();
        System.out.print("Masukkan harga satuan barang 3: ");
        double harga3 = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Masukkan nama barang 4: ");
        String namaBarang4 = input.nextLine();
        System.out.print("Masukkan jumlah barang 4: ");
        int jumlah4 = input.nextInt();
        System.out.print("Masukkan harga satuan barang 4: ");
        double harga4 = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Masukkan nama kasir: ");
        String namaKasir = input.nextLine();
        
        double total1 = harga1 * jumlah1;
        double total2 = harga2 * jumlah2;
        double total3 = harga3 * jumlah3;
        double total4 = harga4 * jumlah4;
        double subtotal = total1 + total2 + total3 + total4;
        
        double diskonPersen = 0;
        if (subtotal >= 500000) {
            diskonPersen = 0.2; 
        } else if (subtotal >= 100000) {
            diskonPersen = 0.1; 
        } else if (subtotal >= 50000) {
            diskonPersen = 0.05; 
        }
        
        double nilaiDiskon = subtotal * diskonPersen;
        double totalBayar = subtotal - nilaiDiskon;
        
        System.out.printf("Total yang harus dibayar: Rp %s\n", formatRupiah(totalBayar));
        System.out.print("Masukkan jumlah bayar: ");
        double jumlahBayar = input.nextDouble();
        
        double kembalian = jumlahBayar - totalBayar;
        
        System.out.println("\n========================================");
        System.out.println("             SHILVIA HASENYANI");
        System.out.println("              255150400111018");
        System.out.println("========================================");
        System.out.println("               FILKOM-MART");
        System.out.println("            JL VETERAN MALANG");
        System.out.println("            TELP. 0341-577911");
        System.out.println();
        System.out.println("20 September 2021               17.56");
        System.out.println("Receipt Number : 150901");
        System.out.println("Order ID       : FM001");
        System.out.println("Collected by   : " + namaKasir);
        System.out.println("========================================");
        
        System.out.println(namaBarang1);
        System.out.printf("%dx @%-15s %15s\n", jumlah1, formatRupiah(harga1), formatRupiah(total1));
        
        System.out.println(namaBarang2);
        System.out.printf("%dx @%-15s %15s\n", jumlah2, formatRupiah(harga2), formatRupiah(total2));
        
        System.out.println(namaBarang3);
        System.out.printf("%dx @%-15s %15s\n", jumlah3, formatRupiah(harga3), formatRupiah(total3));
        
        System.out.println(namaBarang4);
        System.out.printf("%dx @%-15s %15s\n", jumlah4, formatRupiah(harga4), formatRupiah(total4));
        
        System.out.println("========================================");
        System.out.printf("Subtotal%27s\n", "Rp. " + formatRupiah(subtotal));
        
        if (diskonPersen > 0) {
            System.out.println("Diskon");
            System.out.printf("%-8s%27s\n", (int)(diskonPersen * 100) + "%", "-Rp. " + formatRupiah(nilaiDiskon));
        }
        
        System.out.println("========================================");
        System.out.printf("Total%30s\n", "Rp " + formatRupiah(totalBayar));
        System.out.printf("Bayar%30s\n", "Rp " + formatRupiah(jumlahBayar));
        System.out.println("========================================");
        System.out.printf("Kembali%25s\n", "- Rp " + formatRupiah(kembalian));
        System.out.println("========================================");
        System.out.println("      Terima Kasih Telah Berbelanja di");
        System.out.println("               FILKOM-MART");
        
        input.close();
    }
}
