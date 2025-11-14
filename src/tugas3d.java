import java.util.Scanner;

class Item {
    String nama;
    int jumlah;
    double harga;

    Item(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    double getTotal() {
        return jumlah * harga;
    }
}

public class tugas3d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] daftarBarang = {"Beras", "Gula", "Minyak Goreng", "Sabun", "Telur"};
        double[] hargaBarang = {55000, 10000, 56000, 15000, 2500};
        
        System.out.println("=== Selamat Datang di Filkom Mart ===");
        System.out.print("Masukkan nama kasir: ");
        String namaKasir = input.nextLine();
        
        System.out.print("Jumlah barang yang dibeli? ");
        int jumlahJenis = input.nextInt();
        input.nextLine();
        
        Item[] keranjang = new Item[jumlahJenis];
        double totalBelanja = 0;
        
        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("Nama Barang " + (i + 1) + " : ");
            String nama = input.nextLine();
            
            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            int jumlah = input.nextInt();
            input.nextLine();
    
            double harga = 0;
            for (int j = 0; j < daftarBarang.length; j++) {
                if (daftarBarang[j].equalsIgnoreCase(nama)) {
                    harga = hargaBarang[j];
                    break;
                }
            }
            
            keranjang[i] = new Item(nama, jumlah, harga);
            totalBelanja += keranjang[i].getTotal();
        }

        System.out.println("\n========================================");
        System.out.println("             SHILVIA HASENYANI");
        System.out.println("              255150400111018");
        System.out.println("========================================");
        System.out.println("               FILKOM-MART");
        System.out.println("            JL VETERAN MALANG");
        System.out.println("            TELP. 0341-577911");
        System.out.println();
        System.out.println("7 November 2025               17.56");
        System.out.println("Receipt Number\t: 150901");
        System.out.println("Order ID\t: FM001");
        System.out.println("Collected by\t: " + namaKasir);
        System.out.println("========================================");

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.printf("%-15s x %2d = Rp%,.0f\n", 
                keranjang[i].nama, 
                keranjang[i].jumlah, 
                keranjang[i].getTotal());
        }
        
        System.out.println("=========================================");
        System.out.printf("Total Bayar        : Rp%,.0f\n", totalBelanja);
        System.out.println("Terima kasih telah berbelanja di Filkom Mart!");
        
        input.close();
    }
}
