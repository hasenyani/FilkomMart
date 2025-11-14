import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    private String nama;
    private double hargaSatuan;
    private int jumlah;
    
    public Barang(String nama, double hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHargaSatuan() {
        return hargaSatuan;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public double getTotalHarga() {
        return hargaSatuan * jumlah;
    }
    
    public void tampilkanInfo() {
        System.out.printf("%-15s x %2d = Rp%,.0f\n", nama, jumlah, getTotalHarga());
    }
}

class Struk {
    private ArrayList<Barang> daftarBelanja;
    private String namaKasir;
    private String tanggal;
    private String waktu;
    private String receiptNumber;
    private String orderId;
    
    public Struk(String namaKasir) {
        this.daftarBelanja = new ArrayList<>();
        this.namaKasir = namaKasir;
        this.tanggal = "7 November 2025";
        this.waktu = "17.56";
        this.receiptNumber = "150901";
        this.orderId = "FM001";
    }
    
    public void tambahBarang(Barang barang) {
        daftarBelanja.add(barang);
    }
    
    public double hitungTotalBelanja() {
        double total = 0;
        for (Barang barang : daftarBelanja) {
            total += barang.getTotalHarga();
        }
        return total;
    }
    
    public void cetakStruk() {
        System.out.println("\n========================================");
        System.out.println("             SHILVIA HASENYANI");
        System.out.println("              255150400111018");
        System.out.println("========================================");
        System.out.println("               FILKOM-MART");
        System.out.println("            JL VETERAN MALANG");
        System.out.println("            TELP. 0341-577911");
        System.out.println();
        System.out.println(tanggal + "               " + waktu);
        System.out.println("Receipt Number\t: " + receiptNumber);
        System.out.println("Order ID\t: " + orderId);
        System.out.println("Collected by\t: " + namaKasir);
        System.out.println("========================================");
     
        for (Barang barang : daftarBelanja) {
            System.out.printf("%-15s  Rp%,10.0f\n", barang.getNama(), barang.getHargaSatuan());
            System.out.printf("%-15s x %2d = Rp%,.0f\n", "", barang.getJumlah(), barang.getTotalHarga());
        }
        
        System.out.println("=========================================");
        System.out.printf("Total Belanja      : Rp%,.0f\n", hitungTotalBelanja());
        System.out.println("\nTerima kasih telah berbelanja di Filkom Mart!");
    }
}

class KatalogBarang {
    private String[] namaBarang;
    private double[] hargaBarang;
    
    public KatalogBarang() {
        this.namaBarang = new String[]{"Beras", "Gula", "Minyak Goreng", "Sabun", "Telur"};
        this.hargaBarang = new double[]{55000, 10000, 56000, 15000, 2500};
    }
    
    public double cariHarga(String nama) {
        for (int i = 0; i < namaBarang.length; i++) {
            if (namaBarang[i].equalsIgnoreCase(nama)) {
                return hargaBarang[i];
            }
        }
        return 0;
    }
    
    public void tampilkanKatalog() {
        System.out.println("\n=== Daftar Barang Tersedia ===");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.printf("%d. %-15s - Rp%,.0f\n", (i+1), namaBarang[i], hargaBarang[i]);
        }
        System.out.println("==============================\n");
    }
}

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Selamat Datang di Filkom Mart ===");
        System.out.print("Masukkan nama kasir: ");
        String namaKasir = input.nextLine();
        
        Struk struk = new Struk(namaKasir);
        
        KatalogBarang katalog = new KatalogBarang();
        katalog.tampilkanKatalog();
        
        System.out.print("Jumlah barang yang dibeli: ");
        int jumlahJenis = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlahJenis; i++) {
            System.out.println("\n--- Barang " + (i + 1) + " ---");
            System.out.print("Nama Barang: ");
            String nama = input.nextLine();
            
            System.out.print("Jumlah Satuan: ");
            int jumlah = input.nextInt();
            input.nextLine();
            
            double harga = katalog.cariHarga(nama);
            
            if (harga > 0) {
                Barang barang = new Barang(nama, harga, jumlah);
                struk.tambahBarang(barang);
            } else {
                System.out.println("Barang tidak ditemukan dalam katalog!");
            }
        }
        
        struk.cetakStruk();
        
        input.close();
    }
}